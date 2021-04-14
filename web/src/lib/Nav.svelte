<script>
import { formattedTodayDate } from "./utils";
</script>

<nav>
    <a href='/'>dankbaarheid</a>
    <a class='button' href='/editor/{formattedTodayDate()}'>write today</a>
</nav>

<style>
    nav {
        height: 50px;
        display: flex;
        align-items: center;
        justify-content: space-between;
        padding: 0 20px;
    }

    a {
        text-decoration: none;
        color: #a5663b;
        font-weight: 600;
        font-size: 1.3rem;
    }

    .button {
        background-color: #edd6c4;
        color: #a08e86;
        padding: 10px;
        font-size: 1.1rem;
        border-radius: 10px;
    }

    .button:hover {
        background-color: #e7d5c6;
        color: #92817a;
    }
</style>