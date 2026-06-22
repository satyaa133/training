import { useState } from "react";

function UseStateDemo() {
    const [cnt, setCounter] = useState(0);
    const [msg, setMsg] = useState("Value");

    return (
        <div>
            <h1>Counter={cnt}</h1>
            <button onClick={() => setCounter(cnt + 1)}>Increment</button>
            <button onClick={() => setCounter(cnt - 1)}>Decrement</button>
            <h1>{msg}</h1>
            <button onClick={() => setMsg("Value Changed")}>Change Value</button>
        </div>
    );
}

function Books() {
    const [books, setBooks] = useState(["C prog", "Java", "DB"]);
    const [bookName, setBookName] = useState("");
    const addBook = () => {
        setBooks([...books, bookName]);
        setBookName("");
    };

    return (
        <div>
            <input type="text"
            value={bookName}
            onChange={(e)=>setBookName(e.target.value)}
            placeholder="Enter Book Name"
            />
            <button onClick={addBook}>Add Book</button>
            <table>
                <tbody>
                    {books.map((str, index) => (
                        <tr key={index}>
                            <td>{index+1}</td>
                            <td>{str}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}

export { Books };
export default UseStateDemo;
