package club.deltapvp.deltapunishments.api.managers;

import club.deltapvp.deltapunishments.api.structure.ConfigurableGUI;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Optional;

public abstract class GUIManager {

    @Getter
    @Setter
    private static GUIManager instance;

    public abstract ArrayList<ConfigurableGUI> getGUIs();

    public abstract Optional<ConfigurableGUI> getGUI(String input);

    public abstract void reload();

}
