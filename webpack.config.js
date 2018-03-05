var webpack = require('webpack');

module.exports = {
    entry: [
        'script!jquery/dist/jquery.min.js',
        'script!foundation-sites/dist/foundation.min.js',
        './src/main/webapp/app.jsx',
    ],
    externals: {
        jquery:'jQuery'
    },
    plugins: [
        new webpack.ProvidePlugin({
            '$': 'jquery',
            'jQuery': 'jquery'
        })
    ],
    output: {
        path: __dirname,
        filename: './src/main/webapp/bundle.js'
    },
    resolve: {
        root: __dirname,
        alias:{
            Main: 'src/main/webapp/components/Main.jsx',
            applicationStyles: 'src/main/webapp/styles/app.scss',
            Nav: 'src/main/webapp/components/Nav.jsx',
            Timer:'src/main/webapp/components/Timer.jsx',
            Countdown:'src/main/webapp/components/Countdown.jsx',
            Clock:'src/main/webapp/components/Clock.jsx',
            CountdownForm:'src/main/webapp/components/CountdownForm.jsx',
            Controls: 'src/main/webapp/components/Controls.jsx',
            Login: 'src/main/webapp/components/Login.jsx',
            ClaimSubmit: 'src/main/webapp/components/ClaimSubmit.jsx',
            CheckStatus: 'src/main/webapp/components/CheckStatus.jsx'
        },
        extensions: ['', '.js', '.jsx']
    },
    module: {//object
        loaders: [//array of different loaders to use
            {
                loader: 'babel-loader', //telling babel loader to take our files and parse them through react, get the output, and run through es2015
                query:{
                    presets: ['react', 'es2015', 'stage-0']
                },

                test: /\.jsx?$/,       //$ sign looks for the end of the file name and looks for jsx
                exclude: /(node_modules|bower_components)/

            },
            {
                test: /\.png$/,
                loader: "url-loader",
                query: { mimetype: "image/png" }
            }
        ]
    },
    devtool: 'cheap-module-eval-source-map'
};
