import React, { useState } from 'react';

const UserForm = (props) => {
    const [firstname, setFirstname] = useState("");
    const [lastname, setLastname] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [cpassword, setCpassword] = useState("");
    const [firstnameError, setFirstnameError] = useState("");
    const [lastnameError, setLastnameError] = useState("");
    const [emailError, setEmailError] = useState("");

    const handleFirstname = (e) => {
        setFirstname(e.target.value);
        if (e.target.value.length < 2) {
            setFirstnameError("First Name must be 2 characters or longer!");
        }
    }
    const handleLastname = (e) => {
        setLastname(e.target.value);
        if (e.target.value.length < 2) {
            setLastnameError("Last Name must be 2 characters or longer!");
        }
    }
    const handleEmail = (e) => {
        setEmail(e.target.value);
        if (e.target.value.length < 2) {
            setEmailError("Email must be 2 characters or longer!");
        }
    }


    const createUser = (e) => {
        e.preventDefault();

        const newUser = { firstname, lastname, email, password, cpassword };
        console.log("Welcome", newUser);
        setFirstname("");
        setLastname("");
        setEmail("");
        setPassword("");
        setCpassword("")
    };

    return (
        <div>
            <form onSubmit={createUser}>
                <div>
                    <label>First Name: </label>
                    <input type="text" value={firstname} onChange={handleFirstname} />
                </div>
                {firstnameError ?
                    <p> {firstnameError} </p> :
                    ''
                }

                <div>
                    <label> Last Name : </label>
                    <input type='text' value={lastname} onChange={handleLastname} />
                </div>
                {lastnameError ?
                    <p> {lastnameError} </p> :
                    ''
                }
                <div>
                    <label>Email Address: </label>
                    <input type="text" value={email} onChange={handleEmail} />
                </div>
                {emailError ?
                    <p> {emailError} </p> :
                    ''
                }
                <div>
                    <label>Password: </label>
                    <input type="text" value={password} onChange={(e) => setPassword(e.target.value)} />
                </div>
                {password.length < 8 ?
                    <p>Password must be at least 8 charachters</p> :
                    ''}
                <div>
                    <label>Confirm Password: </label>
                    <input type="text" value={cpassword} onChange={(e) => setCpassword(e.target.value)} />
                </div>
                {cpassword !== password ?
                    <p> Passwords must match </p> :
                    ''}
                <input type="submit" value="Create" />
            </form>
            <div>
                <h4>data form</h4>
                <p>First Name : {firstname} </p>
                <p>Last Name : {lastname} </p>
                <p>email :{email} </p>
                <p>password : {password} </p>
                <p>Confirm Password : {cpassword}</p>
            </div>
        </div>
    );
};

export default UserForm;
