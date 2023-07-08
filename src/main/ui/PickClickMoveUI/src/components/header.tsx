import {
    Flex,
    Heading,
    useTheme,
} from '@chakra-ui/react';




export default function Header() {
    const theme = useTheme();
    return (
        <>
            <header>
                <Flex pt='2%' pb='1%' flexDirection='column' bg={`linear-gradient(black, ${theme.colors.lightgrey})`}>
                    <Heading color='white' fontSize='4xl' textAlign='center'>Pick</Heading>
                    <Heading color='white' fontSize='6xl' textAlign='center'>Click</Heading>
                    <Heading color='white' fontSize='8xl' textAlign='center'>Move</Heading>
                </Flex>
            </header>
        </>
    );
}