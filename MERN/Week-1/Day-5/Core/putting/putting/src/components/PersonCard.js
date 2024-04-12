import React, { useState } from 'react';

const PersonCard = (props) => {
    const [age, setAge] = useState(props.age);
    const increase = () => {
        setAge(age + 1);
    }
    return (
        <div>
            <h2> {props.lastname}, {props.firstname}   </h2>
            <p>Age : {age} </p>
            <p> Hair color : {props.haircolor} </p>
            <button onClick={increase}>Birthday Button for {props.lastname} {props.firstname} </button>
        </div>
    )
}
export default PersonCard;