import { AppBar, Toolbar } from "@mui/material";
import MenuIcon from "@mui/icons-material/Menu";
import { BaseTemplateConst } from "./BaseTemplateConst";

export type BaseAppBarProps = {};

export const BaseAppBar = (props: BaseAppBarProps) => {
  return (
    <>
      <AppBar
        position="fixed"
        sx={{ zIndex: (theme) => theme.zIndex.drawer + 1 }}
      >
        <Toolbar
          sx={{
            "@media screen": {
              minHeight: BaseTemplateConst.APP_BAR_MIN_HEIGHT,
            },
          }}
        >
          <MenuIcon />
        </Toolbar>
      </AppBar>
    </>
  );
};
