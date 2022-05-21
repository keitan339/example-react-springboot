import { Route, RouteProps, Routes } from "react-router-dom";

export type BaseRouteProps = RouteProps;

export type BaseRoutesProps = {
  routeList: BaseRouteProps[];
};

export const BaseRoutes = (props: BaseRoutesProps) => {
  return (
    <>
      <Routes>
        {props.routeList.map((elem) => {
          return <Route key={elem.path} {...elem} />;
        })}
      </Routes>
    </>
  );
};
