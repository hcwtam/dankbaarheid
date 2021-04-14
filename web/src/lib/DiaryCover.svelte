<script>
import { appendZeroIfSingleDigit, chooseImage, dateStringToMonth } from "$lib/utils";


    export let date;
    export let monthEntries;
    export let small = false;

    const currentDate = new Date();
    const currentYear = currentDate.getFullYear();
    const currentMonth = currentDate.getMonth() + 1;
    const currentYearAndMonth = currentYear.toString() + "-" + appendZeroIfSingleDigit(currentMonth.toString()) // e.g. "2021-04"
    const lastEntryDate = monthEntries[monthEntries.length - 1].date;
    const src = `images/${chooseImage(date)}.jpg`
</script>


    <a href="entries/{currentYearAndMonth === date ? currentYearAndMonth + "-" + appendZeroIfSingleDigit(currentDate.getDate().toString()):lastEntryDate}">
        <div class='container'  class:small>
            <img {src} alt="book cover" class:small/>
            <h1>{dateStringToMonth(date)} {date.substring(0,4)}</h1>
        </div>
    </a>



<style>
    .container {
        width: 280px;
        height: 350px;
        background-color: #aac4db;
        border-radius: 2px 20px 20px 2px;
        cursor: pointer;
        transition: 0.1s all ease-out;
        position: relative;
    }

    .container::after {
        content: '';
        position: absolute;
        left: 0;
        top: 0;
        width: 100%;
        height: 100%;
        box-shadow: rgba(97, 68, 48, 0.7) 12px 20px 30px -10px, rgba(82, 63, 50, 0.7) 14px 24px 50px -10px, rgba(255, 255, 255, 0.3) inset 3px 1px 6px, rgba(255, 255, 255, 0.3) inset 3px -1px 6px;
        border-radius: 4px 20px 20px 4px;
        z-index: 1;
        pointer-events: none;
    }

    img {
        width: 100%;
        height: 350px;
        margin: auto;
        object-fit: fill;
        position: absolute;
        border-radius: 2px 20px 20px 2px;
        overflow: hidden;
    }

    .container.small,
    img.small {
        width: 100px;
        height: 125px;
    }

    .container:hover {
        transform: scale(1.01);
    }

    h1 {
        z-index: 1;
        position: absolute;
        padding: 10px 30px;
        font-size: 2rem;
        width: 100%;
        color:rgba(255, 255, 255, 0.2);
        text-shadow: -1px 0 rgba(125, 125, 125, 0.1), 0 1px rgba(255, 255, 255, 0.2), 1px 0 rgba(255, 255, 255, 0.2), 0 -1px rgba(255, 255, 255, 0.2);
        word-spacing: 50%;
    }

    .small h1 {
        font-size: 0.6rem;
        padding: 10px 15px;
    }

    
</style>

