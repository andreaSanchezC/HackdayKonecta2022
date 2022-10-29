var ctx = document.getElementById('barChart').getContext('2d');
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
/*
//estadisticas de ventas por refrepresentante, los datos van en dineroo
    <script>
        const labels = [
            'Julio',
            'Agosto',
            'Septiembre',
            'Octubre',
            'Noviembre',
            'Diciembre',
        ];
        const data = {
            labels: labels,
            datasets: [
                {
                    label: 'Paula muñoz',
                    data: [9, 12, 5, 10, 7, 9],
                    backgroundColor: 'rgb(0, 153, 153)',
                },
                {
                    label: 'Adrián Suarez',
                    data: [8, 10, 7, 1, 7],
                    backgroundColor: 'rgb(102, 178, 255)',
                },
                {
                    label: 'Juliana Mendoza',
                    data: [8, 3, 20, 10, 7],
                    backgroundColor: 'rgb(102, 255, 102)',
                },
            ]
        };
        // </block:setup>

        // <block:config:0>
        const config = {
            type: 'bar',
            data: data,
            options: {
                plugins: {
                    title: {
                        display: true,
                        text: 'Ventas por representante (6 meses)'
                    },
                },
                responsive: true,
                scales: {
                    x: {
                        stacked: true,
                    },
                    y: {
                        stacked: true
                    }
                }
            }
        };

    </script>
    <script>
        const myChart = new Chart(
            document.getElementById('myChart'),
            config
        );
    </script>
 */