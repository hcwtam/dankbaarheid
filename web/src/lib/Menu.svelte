<script>
import DiaryCover from "./DiaryCover.svelte";

    let current = "2021"
</script>

<div class='menu'>
    <div class='yearButtons'>
        <button 
            class:selected='{current === '2021'}' 
            on:click="{()=>current='2021'}"
        >
            2021
        </button>
        <button 
            class:selected='{current === '2020'}' 
            on:click="{()=>current='2020'}"
        >
            2020
        </button>
    </div>
    <ul>
        <li>
            <DiaryCover small/>
            <div class='info'>
                <div>
                    <h2>April</h2>
                    <div>21 entries</div>
                </div>
                <div class='lastEntry'>9th April 21</div>
            </div>
        </li>
    </ul>
</div>

<style>
    .menu {
        position: absolute;
        bottom: 0;
        left: 0;
        background-color: #fdfaf5;
        border-radius: 40px 40px 0 0;
        width: 100vw;
        box-shadow: rgba(149, 157, 165, 0.2) 0px 8px 24px;
    }

    .yearButtons {
        margin: 15px 50px 0;
        border-bottom: 1px solid #e7e4e0;
        color: #777;
        z-index: 100;
        background-color: #fdfaf5;
    }

    button {
        line-height: 2.5;
        margin: 0 10px;
    }

    .selected {
        font-weight: 600;
        color: #555;
        box-shadow: 0 2px 0 #555;
    }

    ul {
        display: flex;
        margin: 0;
        padding-top: 20px;
        flex-wrap: wrap;
        justify-content: space-between;
        height: 340px;
        overflow-y: auto;
    }

    li {
        list-style: none;
        padding: 10px;
        min-width: 300px;
        width: 22%;
        height: 130px;
        margin-bottom: 20px;
        display: flex;
        cursor: pointer;
        border-radius: 10px;
    }

    li:hover {
        background-color: rgba(0, 0, 0, 0.03);
    }

    .info {
        margin-left: 20px;
        font-size: 14px;
        display: flex;
        flex-direction: column;
        justify-content: space-between;
        padding: 10px;
    }

    .lastEntry {
        background-color: #ffffff;
        border-radius: 5px;
        box-shadow: 0 0 5px #eee;
        padding: 5px;
    }

    h2 {
        margin: 0;
        font-size: 1.2rem;
    }

    
</style>

