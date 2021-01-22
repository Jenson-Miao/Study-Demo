import React,{Component} from 'react';
import Ball from './components/Ball'

class App extends Component{
    render() {
        return (
            <Ball xSpeed={100} ySpeed={200}/>
        )
    }
}

export default App;
