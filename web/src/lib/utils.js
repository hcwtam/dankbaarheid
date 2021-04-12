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
