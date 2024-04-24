import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'

const Create = () => {
    const [title, setTitle] = useState("")
    const [price, setPrice] = useState("")
    const [description, setDescription] = useState("")
    const [errors, setErrors] = useState([])
    const nav = useNavigate()

    const SubmitHandler = (e) => {
        e.preventDefault()
        axios.post(`http://localhost:8001/api/product/new`, {
            title,
            price,
            description
        })
            .then((res) => {
                console.log("✅✅✅✅✅")
                nav("/")
            })
            .catch((err) => {
                const errorRes = err.response.data.errors;
                const errArray = []
                for (const key of Object.keys(errorRes)) {
                    errArray.push(errorRes[key].message)
                }
                setErrors(errArray)
                console.log(err)
            })
    }

    return (
        <div className='container'>
            <h3> Product manager</h3>
            <form onSubmit={SubmitHandler}>
                {errors.map((err, i) => (
                    <p key={i} className='text-danger'>{err}</p>
                ))}
                <label className='label-control'>Title</label>
                <input className='label-control' value={title} type="text" onChange={(e) => { setTitle(e.target.value) }} />
                <br />
                <label className='label-control'>Price</label>
                <input className='label-control' value={price} type="text" onChange={(e) => { setPrice(e.target.value) }} />
                <br />
                <label className='label-control'>Description</label>
                <input className='label-control' value={description} type="text" onChange={(e) => { setDescription(e.target.value) }} />
                <br />
                <button className='btn btn-success'>Create</button>


            </form>


        </div>
    )
}

export default Create