var ctx = document.getElementById('lineChart1').getContext('2d');
var myChart = new Chart(ctx, {
    type: 'line',
    data: {
        labels: ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sábado',],
        datasets: [{
            label: 'Valor de venta diario',
            data: [0, 10, 5, 2, 20, 30, 45],
            backgroundColor: 'rgb(0, 153, 153)',
            borderColor: 'rgb(0, 153, 153)',
            borderWidth: 1,
            fill: false
        }
    ]
    },
    options: {
        responsive: true,
        plugins: {
            legend: {
              display: false
            }
          }
    }
});
