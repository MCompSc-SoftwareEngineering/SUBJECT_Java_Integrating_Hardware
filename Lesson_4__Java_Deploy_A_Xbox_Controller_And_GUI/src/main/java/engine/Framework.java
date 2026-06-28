package engine;
import structs.*;
import structs.peripheralSamples.xboxController;
import threads.EventListener_XBoxController;

import javax.swing.*;
public class Framework
{
    private static App _stat_CLASS_Framework_App;
    private static Global _stat_CLASS_Global;
    private static Game_Instance _stat_STRUCT_INSTANCE_Game;
    private static Algorithim _stat_STRUCT_Algorithim;
    private static Input _stat_STRUCT_Input;
    private static Output _stat_STRUCT_Output;
    private static User_Algorithim _stat_STRUCT_User_Algorithims;
    private static User_Input _stat_STRUCT_User_Inputs;
    private static User_Output _stat_STRUCT_User_Outputs;
    private static EventListener_XBoxController _stat_THREAD_EventListener_XBoxController;
    public Framework() {
        System.out.printf("entered CONSTRUCTOR Framework()%n");
        stat_CLASS_boot0_DECLAIRE_Framework_App();
        System.out.printf("exiting CONSTRUCTOR Framework()%n");
    }
    public void dyn_CLASS_establish_Framework() {
        stat_CLASS_boot1_DEFINE_Framework_App();
        stat_CLASS_boot3_INITIALISE_Framework_App();
    }
    public void dyn_CLASS_complete_Framework(Framework obj) {
        dyn_STRUCT_boot0_DECLAIRE();
        dyn_SRUCT_boot1_DEFINE();
        dyn_STRUCT_boot3_INITIALISE(obj);

    }
    public void dyn_CLASS_create_Global_and_Settings() {
        boot1_CLASS_boot1_DEFINE_Global();
        boot3_CLASS_INITIALISE_Global();
    }
    public App dyn_CLASS_get_Framework_App() {
        return stat_CLASS_get_Framework_App();
    }
    public Global dyn_CLASS_get_Global() {
        return stat_CLASS_get_Global();
    }
    public void dyn_REG_boot1_DEFINE_Framework_App(Framework obj) {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Framework_App().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Framework_App().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Framework_App(Framework obj) {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Framework_App().%n");

        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Framework_App().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Framework_App(Framework obj, Input structDEFAULT_Input, Output structDEFAULT_Output) {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Framework_App().%n");

        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Framework_App().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Framework_App(Framework obj) {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Framework_App().%n");
        obj.dyn_CLASS_get_Framework_App().dyn_CLASS_get_Execute().dyn_REG_boot4_INSTANTIATE_Execute();
        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Framework_App().%n");
    }
    public Algorithim dyn_STRUCT_get_Algorithim() {
        return stat_STRUCT_get_Algorithim();
    }
    public Input dyn_STRUCT_get_Input() {
        return stat_STRUCT_get_Input();
    }
    public Game_Instance dyn_STRUCT_get_INSTANCE_Game() {
        return stat_STRUCT_get_INSTANCE_Game();
    }
    public Output dyn_STRUCT_get_Output() {
        return stat_STRUCT_get_Output();
    }
    public User_Input dyn_STRUCT_get_User_Input() {
        return stat_STRUCT_get_User_Input();
    }
    public User_Output dyn_STRUCT_get_User_Output() {
        return stat_STRUCT_get_User_Output();
    }
    public EventListener_XBoxController dyn_THREAD_get_EventListener_XBoxController() {
        return _stat_THREAD_EventListener_XBoxController;
    }
    public void dyn_STRUCT_boot0_DECLAIRE() {
        System.out.printf("entered stat_STRUCT_boot0_DECLAIRE().%n");

        System.out.printf("exiting stat_STRUCT_boot0_DECLAIRE().%n");
    }
    public void dyn_SRUCT_boot1_DEFINE() {
        System.out.printf("entered stat_STRUCT_boot1_DEFINE().%n");
        stat_STRUCT_boot1_DEFINE_User_Input();
        stat_STRUCT_boot1_DEFINE_User_Output();
        stat_STRUCT_boot1_DEFINE_User_Algorithim();
        stat_STRUCT_boot1_DEFINE_Algorithim();
        stat_STRUCT_boot1_DEFINE_Input();
        stat_STRUCT_boot1_DEFINE_Output();
        stat_STRUCT_boot1_DEFINE_INSTANCE_Game();
        stat_THREAD_boot1_DEFINE_EventListener_XBoxController();
        //todo.
        System.out.printf("exiting stat_STRUCT_boot1_DEFINE().%n");
    }
    public void dyn_STRUCT_boot3_INITIALISE(Framework obj) {
        System.out.printf("entered stat_STRUCT_boot3_INITIALISE().%n");
        stat_STRUCT_boot3_INITIALISE_User_Input();
        stat_STRUCT_boot3_INITIALISE_User_Output();
        stat_STRUCT_boot3_INITIALISE_User_Algorithim();
        stat_STRUCT_boot3_INITIALISE_Algorithim();
        stat_STRUCT_boot3_INITIALISE_Input();
        stat_STRUCT_boot3_INITIALISE_Output();
        stat_STRUCT_boot3_INITIALISE_INSTANCE_Game();
        stat_THREAD_boot3_INITIALISE_EventListener_XBoxController(obj);
        //todo.
        System.out.printf("exiting stat_STRUCT_boot3_INITIALISE().%n");
    }
// private.
    // classes.
    private static void stat_CLASS_boot0_DECLAIRE_Framework_App() {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Framework_App().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Framework_App().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Framework_App() {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Framework_App().%n");
        _stat_CLASS_Framework_App = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Framework_App().%n");
    }
    private static void boot1_CLASS_boot1_DEFINE_Global() {
        System.out.printf("entered boot1_CLASS_boot1_DEFINE_Global().%n");
        _stat_CLASS_Global = null;
        System.out.printf("exiting boot1_CLASS_boot1_DEFINE_Global().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Framework_App() {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Framework_App().%n");
        _stat_CLASS_Framework_App = new App();
        try {
                stat_CLASS_get_Framework_App();
        } 
        catch (NullPointerException e) {
                System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Framework_App().%n");
    }
    private static void boot3_CLASS_INITIALISE_Global() {
        System.out.printf("entered boot3_CLASS_INITIALISE_Global().%n");
        _stat_CLASS_Global = new Global();
        try {
            stat_CLASS_get_Global();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting boot3_CLASS_INITIALISE_Global().%n");
    }
    private static App stat_CLASS_get_Framework_App()
    {
        return _stat_CLASS_Framework_App;
    }
    private static Global stat_CLASS_get_Global()
    {
        return _stat_CLASS_Global;
    }
    // structures.
    private static void stat_STRUCT_boot1_DEFINE_Algorithim() {
        _stat_STRUCT_Algorithim = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_Input() {
        _stat_STRUCT_Input = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_INSTANCE_Game() {
        _stat_STRUCT_INSTANCE_Game = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_Output() {
        _stat_STRUCT_Output = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_User_Algorithim() {
        _stat_STRUCT_User_Algorithims = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_User_Input() {
        _stat_STRUCT_User_Inputs = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_User_Output() {
        _stat_STRUCT_User_Outputs = null;
    }
    private static void stat_STRUCT_boot3_INITIALISE_Algorithim() {
        _stat_STRUCT_Algorithim = new Algorithim();
        try {
            stat_STRUCT_get_Algorithim();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_Input() {
        _stat_STRUCT_Input = new Input();
        try {
            stat_STRUCT_get_Input();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_INSTANCE_Game() {
        _stat_STRUCT_INSTANCE_Game = new Game_Instance();
        try {
            stat_STRUCT_get_INSTANCE_Game();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_Output() {
        _stat_STRUCT_Output = new Output();
        try {
            stat_STRUCT_get_Output();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_User_Algorithim() {
        _stat_STRUCT_User_Algorithims = new User_Algorithim();
        try {
            stat_STRUCT_get_User_Algorithim();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_User_Input() {
        _stat_STRUCT_User_Inputs = new User_Input();
        try {
            stat_STRUCT_get_User_Input();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_User_Output() {
        _stat_STRUCT_User_Outputs = new User_Output();
        try {
            stat_STRUCT_get_User_Output();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_OutputGameInstance_Data() {
        _stat_STRUCT_INSTANCE_Game = new Game_Instance();
        try {
            stat_STRUCT_get_INSTANCE_Game();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static Algorithim stat_STRUCT_get_Algorithim() {
        return _stat_STRUCT_Algorithim;
    }
    private static Input stat_STRUCT_get_Input() {
        return _stat_STRUCT_Input;
    }
    private static Game_Instance stat_STRUCT_get_INSTANCE_Game() {
        return _stat_STRUCT_INSTANCE_Game;
    }
    private static Output stat_STRUCT_get_Output() {
        return _stat_STRUCT_Output;
    }
    private static User_Input stat_STRUCT_get_User_Input() {
        return _stat_STRUCT_User_Inputs;
    }
    private static User_Output stat_STRUCT_get_User_Output() {
        return _stat_STRUCT_User_Outputs;
    }
    private static User_Algorithim stat_STRUCT_get_User_Algorithim() {
        return _stat_STRUCT_User_Algorithims;
    }
    private static void stat_THREAD_boot1_DEFINE_EventListener_XBoxController() {
        _stat_THREAD_EventListener_XBoxController = null;
    }
    private static void stat_THREAD_boot3_INITIALISE_EventListener_XBoxController(Framework obj) {
        System.out.printf("entered _stat_THREAD_boot3_INITIALISE_EventListener_XBoxController().%n");
        _stat_THREAD_EventListener_XBoxController = new EventListener_XBoxController();
        try {
            SwingUtilities.invokeLater(() -> {
                stat_REG_get_EventListener_XBoxController().doScanOfXBoxControllers(obj);
            });
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting _stat_THREAD_boot3_INITIALISE_EventListener_XBoxController().%n");
    }
    private static EventListener_XBoxController stat_REG_get_EventListener_XBoxController() {
        return _stat_THREAD_EventListener_XBoxController;
    }
}