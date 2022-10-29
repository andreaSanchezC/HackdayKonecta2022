var ctx2 = document.getElementById('doughnut2').getContext('2d');
var myChart2 = new Chart(ctx2, {
    type: 'doughnut',
    data: {
        labels: ['Ventas', 'No ventas', 'Ventas pospuestas'],

        datasets: [{
            label: 'Dataset 1',
            data: [9, 12, 5],
            backgroundColor: ['rgb(255, 102, 102)', 'rgb(255, 153, 51)','rgb(255, 226, 75)'],
            borderColor: ['rgb(255, 102, 102)', 'rgb(255, 153, 51)','rgb(255, 226, 75)'],
            borderWidth: 1
        }]

    },
    options: {
        responsive: true
        
    }
});
/*
<script>
        const data = {
            labels: ['Maquina', 'Fileteadora', 'Cortadora', 'Pulidora', 'Nevera industrial'],
            datasets: [
                {
                    label: 'Dataset 1',
                    data: [9, 12, 5, 10, 7],
                    backgroundColor: ['rgb(0, 204, 204)', 'rgb(51, 153, 255)','rgb(255, 102, 102)', 'rgb(255, 153, 51)','rgb(255, 226, 75)'],
                }
            ]
        };
        // </block:setup>

        // <block:config:0>
        const config = {
            type: 'doughnut',
            data: data,
            options: {
                responsive: true,
                plugins: {
                    legend: {
                        position: 'top',
                    },
                    title: {
                        display: true,
                        text: 'Rendimiento de productos'
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
    </script>
*/