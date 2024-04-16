import React from 'react'
import { useParams } from "react-router-dom";

const Hello = (props) => {
    const { string, colortext, colorbg } = useParams();
    return (
        <div>
            <h2 style={{ color: colortext, backgroundColor: colorbg }}>{string}</h2>

        </div>
    )
}

export default Hello