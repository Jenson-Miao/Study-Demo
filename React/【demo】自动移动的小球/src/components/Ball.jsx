import React, {Component} from 'react';
import './Ball.css'

/**
 * 一个小球组件
 */
class Ball extends Component {
    constructor(props) {
        /**
         * 属性中需要传入横纵坐标的上的速度，每秒移动的距离
         * props.xSpeed,props.ySpeed
         */
        super(props)
        this.state = {
            //初始位置
            left: props.left || 0,
            top: props.top || 0,
            xSpeed: props.xSpeed,
            ySpeed: props.ySpeed
        }
        //每次运动间隔的毫秒数
        const duration = 10
        setInterval(() => {
            //计算每次运动移动的距离
            const xDis = this.state.xSpeed * duration / 1000;
            const yDis = this.state.ySpeed * duration / 1000;
            //根据速度，改变left和top值
            let left = this.state.left + xDis
            let top = this.state.top + yDis
            //设置边界(超出窗口的位置就反弹)
            if (left <= 0) {
                left = 0
                this.setState({
                    xSpeed: -this.state.xSpeed
                })
            } else if (left >= document.documentElement.clientWidth - 100) {
                left = document.documentElement.clientWidth - 100
                this.setState({
                    xSpeed: -this.state.xSpeed
                })
            }
            if (top <= 0) {
                top = 0
                this.setState({
                    ySpeed: -this.state.ySpeed
                })
            } else if (top >= document.documentElement.clientHeight - 100) {
                top = document.documentElement.clientHeight - 100
                this.setState({
                    ySpeed: -this.state.ySpeed
                })
            }
            //重新设置小球的位置
            this.setState({
                left,
                top
            })
        }, duration)
    }

    render() {
        return (
            <div className="ball" style={{
                left: this.state.left,
                top: this.state.top
            }}></div>
        )
    }
}

export default Ball;
