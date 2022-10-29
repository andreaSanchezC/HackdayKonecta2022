
    

//Indice de crecimientooo (6 meses)-->
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
                    label: 'Indice actual',
                    data: [8, 3, 20, 10, 7, 9],
                    borderColor: 'rgb(102, 255, 102)',
                    backgroundColor: 'rgb(102, 255, 102)',
                    stack: 'combined',
                    type: 'bar'
                },
                {
                    label: 'Indice actual',
                    data: [8, 3, 20, 10, 7, 9],
                    borderColor: 'rgb(102, 178, 255)',
                    backgroundColor: 'rgb(102, 178, 255)',
                    stack: 'combined'
                },
                {
                    label: 'Indice ideal',
                    data: [20, 18, 20, 17, 10, 20],
                    borderColor: 'rgb(96, 96, 96)',
                    backgroundColor: 'rgb(96, 96, 96)',
                    stack: 'combined'
                }
            ]
        };

        // <block:config:0>
        const config = {
            type: 'line',
            data: data,
            options: {
                plugins: {
                    title: {
                        display: true,
                        text: 'Indice de crecimiento'
                    }
                },
                scales: {
                    y: {
                        stacked: true
                    }
                }
            },
        };
    </script>
    <script>
        const myChart = new Chart(
            document.getElementById('myChart'),
            config
        );
    </script>*/