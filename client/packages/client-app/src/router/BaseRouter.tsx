import { ReactNode } from "react";
import { BrowserRouter } from "react-router-dom";

export type BaseRouterProps = {
  children: ReactNode;
};

export const BaseRouter = (props: BaseRouterProps) => {
  return (
    <>
      <BrowserRouter>{props.children}</BrowserRouter>
    </>
  );
};
