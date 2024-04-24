import axios from 'axios'
import { useEffect } from 'react'
import React, { useState, } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

const Create = () => {
    const { id } = useParams()
    const nav = useNavigate();
    const [title, setTitle] = useState("")
    const [price, setPrice] = useState("")
    const [description, setDescription] = useState("")
    const [errors, setErrors] = useState([])
    const navigate = useNavigate();

    const SubmitHandler = (e) => {
        e.preventDefault()
        axios.put(`http://localhost:8001/api/product/` + id, { title, price, description })
            .then((res) => {
                console.log("✅✅✅✅✅")
                navigate('/');
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

    useEffect(() => {
        axios.get('http://localhost:8001/api/product/' + id)
            .then(res => {
                setTitle(res.data.title)
                setPrice(res.data.price)
                setDescription(res.data.description)
            })

    }, [id])

    return (
        <div className='container'>
            <h3> Edit Product</h3>
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
                <button className='btn btn-success'>Edit</button>


            </form>


        </div>
    )
}

export default Create