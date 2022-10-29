var ctx = document.getElementById('barChart').getContext('2d');
var myChart = new Chart(ctx, {

    type: 'bar',
    data: {
        labels: ['María', 'Jenny', 'Juan', 'Juliana','lisa'],
        datasets: [
            {
                label: 'Dataset 1',
                data: [9, 12, 5, 6, 10],
                borderColor: 'rgb(255, 153, 51)',
                backgroundColor: 'rgb(255, 153, 51)',
                order: 1
            },
            
            {
                label: 'Dataset 4',
                data: [9, 12, 5, 6, 10],
                borderColor: 'rgb(255, 102, 102)',
                backgroundColor: 'rgb(255, 102, 102)',
                type: 'line',
                order: 0
            }
        ]
    },
    options: {
        responsive: true,
        plugins: {
            legend: {
              position: 'top',
              display: false,
            },
            title: {
              display: false,
            }
    }
}
});

