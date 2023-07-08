import { ReactNode } from 'react';
import Header from './header';
import { Box } from '@chakra-ui/react';




type LayoutProps = {
    children: ReactNode;
  };

export default function Layout({ children }: LayoutProps) {
    return (
        <>
            <Header/>
            <main>{children}</main>
            <footer></footer>
        </>
    );
}