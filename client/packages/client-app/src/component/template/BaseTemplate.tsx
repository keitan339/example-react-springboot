import { Container, CssBaseline } from "@mui/material";
import { Box } from "@mui/system";
import { ReactNode } from "react";
import { BaseAppBar } from "./BaseAppBar";
import { BaseDrawerMenu, BaseDrawerMenuProps } from "./BaseDrawerMeu";
import { BaseTemplateConst } from "./BaseTemplateConst";

export type BaseTemplateProps = {
  children: ReactNode;
  drawerMenuInfo: BaseDrawerMenuProps["menuInfo"];
};
export const BaseTemplate = (props: BaseTemplateProps) => {
  return (
    <>
      <CssBaseline />
      <BaseAppBar></BaseAppBar>
      <Box
        sx={{
          display: "flex",
          paddingTop: BaseTemplateConst.APP_BAR_MIN_HEIGHT,
        }}
      >
        <BaseDrawerMenu menuInfo={props.drawerMenuInfo}></BaseDrawerMenu>
        <Box>
          <Container>{props.children}</Container>
        </Box>
      </Box>
    </>
  );
};
