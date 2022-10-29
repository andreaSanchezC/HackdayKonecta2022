var ctx = document.getElementById('lineChart').getContext('2d');
var myChart = new Chart(ctx, {
    type: 'line',
    data: {
        labels: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre','Diciembre'],
        datasets: [{
            label: '2021',
            data: [9, 10, 5, 2, 20, 30, 45, 6, 19, 23, 14, 15],
            backgroundColor: 'rgb(102, 102, 255)',
            borderColor: 'rgb(102, 102, 255)',
            borderWidth: 1,
            borderRadius: 5,
            borderSkipped: false,
        },
        {
            label: '2022',
            data: [9, 12, 5, 4, 29, 11, 40, 45, 19, 23, 10, 12],
            backgroundColor: 'rgb(0, 153, 153)',
            borderColor: 'rgb(0, 153, 153)',
            borderWidth: 1,
            borderRadius: 5,
            borderSkipped: false,
        }
    ]
    },
    options: {
        responsive: true
    }
});

