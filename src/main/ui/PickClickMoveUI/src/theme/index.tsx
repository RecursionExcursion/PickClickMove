import { extendTheme } from '@chakra-ui/react'
import {styles} from './styles'
// import borders from "./foundations/borders"
// import {CardStyles as Card} from "./components/cardStyles"


const theme = extendTheme({
    config:{
        initalColorMode: 'dark',
        useSystemColorMode: true, 

    },
    ...styles,
    // borders,
    components: {
        // Card,
    }
})

export default theme;