import React, { useEffect, useState } from 'react';
import { useNavigate, useParams } from 'react-router-dom';
import axios from 'axios';


const Show = () => {
    const [product, setProduct] = useState({})
    const { id } = useParams()
    const nav = useNavigate()
    useEffect(() => {
        axios.get('http://localhost:8001/api/product/' + id)
            .then(res => setProduct(res.data))
            .catch(err => console.log(err));
    }, [id])
    return (
        <div className='container'>
            <div >
                <h5>Name: {product.title}</h5>
                <p>Price:{product.price}</p>
                <p>Description:{product.description}</p>
                <button className='btn btn-secondary' onClick={() => nav('/')}>Home </button>
            </div>

        </div>
    )
}

export default Show;