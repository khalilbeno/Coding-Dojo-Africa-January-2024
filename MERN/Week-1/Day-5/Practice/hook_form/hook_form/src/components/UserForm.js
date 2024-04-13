import React, { useState } from 'react';

const UserForm = (props) => {
    const [firstname, setFirstname] = useState("");
    const [lastname, setLastname] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [cpassword, setCpassword] = useState("");

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
                    <input type="text" value={firstname} onChange={(e) => setFirstname(e.target.value)} />
                </div>
                <div>
                    <label> Last Name : </label>
                    <input type='text' value={lastname} onChange={(e) => setLastname(e.target.value)} />
                </div>
                <div>
                    <label>Email Address: </label>
                    <input type="text" value={email} onChange={(e) => setEmail(e.target.value)} />
                </div>
                <div>
                    <label>Password: </label>
                    <input type="text" value={password} onChange={(e) => setPassword(e.target.value)} />
                </div>
                <div>
                    <label>Confirm Password: </label>
                    <input type="text" value={cpassword} onChange={(e) => setCpassword(e.target.value)} />
                </div>
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
