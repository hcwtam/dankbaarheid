const MONTHS = [
	'January',
	'February',
	'March',
	'April',
	'May',
	'June',
	'July',
	'August',
	'September',
	'October',
	'November',
	'December'
];

export const dateStringToMonth = (dateString) => {
	// date string: e.g. "2021-04-12". YYYY-MM-DD
	return MONTHS[+dateString.substring(5, 7) - 1];
};

export const categoriseEntries = (entries) => {
	const sortedEntries = {};
	for (let i = 0; i < entries.length; i++) {
		const entry = entries[i];
		const yearAndMonth = entry.date.substring(0, 7);
		if (sortedEntries[yearAndMonth]) sortedEntries[yearAndMonth].push(entry);
		else sortedEntries[yearAndMonth] = [entry];
	}
	return sortedEntries;
};

export const dateStringToYear = (dateString) => {
	return dateString.substring(0, 4);
};

export const chooseImage = (dateString) => {
	const month = +dateString.substring(5, 7);
	const year = +dateString.substring(0, 4);
	return year & (2 === 0) ? month.toString() : (12 + month).toString();
};

export const appendZeroIfSingleDigit = (num) => {
	//num is number type
	return num < 10 ? "0" + num.toString() : num.toString()
	
}

export const formattedTodayDate = () => {
	const currentDate = new Date();
    const currentYear = currentDate.getFullYear();
    const currentMonth = currentDate.getMonth() + 1;
    const currentDay = currentDate.getDate();
    return currentYear.toString() + "-" + appendZeroIfSingleDigit(currentMonth.toString()) + "-" + appendZeroIfSingleDigit(currentDay.toString())// e.g. "2021-04-13"
}