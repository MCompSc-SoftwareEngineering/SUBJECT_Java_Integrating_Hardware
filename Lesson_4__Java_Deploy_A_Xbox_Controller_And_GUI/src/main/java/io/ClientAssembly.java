package io;
import engine.Framework;
public class ClientAssembly 
{
    public static Framework _stat_CLASS_framework;
    // public.
    public static Framework app_generate_Program()
    {
        System.out.printf("entered DESKTOP APPLICATION generate_Program().%n");

        System.out.printf("started architectured classes - DECLAIRE.%n");
        stat_CLASS_boot1_DEFINE_framework();
        stat_CLASS_boot3_INITIALISE_framework();
        System.out.printf("done architectured classes - DECLAIRE.%n");

        System.out.printf("started class Global generate.%n");
        stat_CLASS_get_Framework().dyn_CLASS_create_Global_and_Settings();
        stat_CLASS_get_Framework().dyn_CLASS_get_Global().dyn_REG_boot1_DEFINE_Global();
        stat_CLASS_get_Framework().dyn_CLASS_get_Global().dyn_REG_boot2_SUBSTANTIATE_Global();
        stat_CLASS_get_Framework().dyn_CLASS_get_Global().dyn_REG_boot3_INITIALISE_Global();
        System.out.printf("done class Global generate.%n");

        System.out.printf("started architecture Class top level Framework() - DECLAIRE, DEFINE INITIALISE, Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");
        System.out.printf("started STRUCTS generate.%n");
        stat_CLASS_get_Framework().dyn_CLASS_establish_Framework();
        stat_CLASS_get_Framework().dyn_CLASS_complete_Framework(stat_CLASS_get_Framework());
        System.out.printf("done STRUCTS generate.%n");
        System.out.printf("done architecture Class top level Framework() - DECLAIRE, DEFINE INITIALISE, Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");
    
        System.out.printf("started ARCHITECTURE generate. - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");
        System.out.printf("started architectured classes - Registers - DEFINE.%n");
        stat_CLASS_get_Framework().dyn_REG_boot1_DEFINE_Framework_App(stat_CLASS_get_Framework());
        stat_CLASS_get_Framework().dyn_CLASS_get_Framework_App().dyn_REG_boot1_DEFINE_App(stat_CLASS_get_Framework());
        stat_CLASS_get_Framework().dyn_CLASS_get_Framework_App().dyn_CLASS_get_Algorithims().dyn_REG_boot1_DEFINE_Algorithims(stat_CLASS_get_Framework());
        stat_CLASS_get_Framework().dyn_CLASS_get_Framework_App().dyn_CLASS_get_Data().dyn_REG_boot1_DEFINE_Data();
        stat_CLASS_get_Framework().dyn_CLASS_get_Framework_App().dyn_CLASS_get_Data().dyn_CLASS_get_INSTANCE_Game().dyn_REG_boot1_DEFINE_Game_Instance(stat_CLASS_get_Framework());
        //stat_CLASS_get_Framework().dyn_CLASS_get_Framework_App().dyn_CLASS_get_Data().dyn_CLASS_get_INSTANCE_Game().dyn_REG_get_Item_On_Array_Of_xboxController(0)
        stat_CLASS_get_Framework().dyn_CLASS_get_Framework_App().dyn_CLASS_get_Execute().dyn_REG_boot1_DEFINE_Execute(stat_CLASS_get_Framework());
        System.out.printf("done architectured classes - Registers - DEFINE.%n");

        System.out.printf("started architectured classes - Registers - SUBSTANTIATE.%n");
        stat_CLASS_get_Framework().dyn_REG_boot2_SUBSTANTIATE_Framework_App(stat_CLASS_get_Framework());
        stat_CLASS_get_Framework().dyn_CLASS_get_Framework_App().dyn_REG_boot2_SUBSTANTIATE_App(stat_CLASS_get_Framework());
        stat_CLASS_get_Framework().dyn_CLASS_get_Framework_App().dyn_CLASS_get_Algorithims().dyn_REG_boot2_SUBSTANTIATE_Algorithims(stat_CLASS_get_Framework());
        stat_CLASS_get_Framework().dyn_CLASS_get_Framework_App().dyn_CLASS_get_Data().dyn_REG_boot2_SUBSTANTIATE_Data(stat_CLASS_get_Framework());
        stat_CLASS_get_Framework().dyn_CLASS_get_Framework_App().dyn_CLASS_get_Data().dyn_CLASS_get_INSTANCE_Game().dyn_REG_boot2_SUBSTANTIATE_Game_Instance(stat_CLASS_get_Framework());

        stat_CLASS_get_Framework().dyn_CLASS_get_Framework_App().dyn_CLASS_get_Execute().dyn_REG_boot2_SUBSTANTIATE_Execute(stat_CLASS_get_Framework());
        System.out.printf("done architectured classes -Registers - SUBSTANTIATE.%n");

        System.out.printf("started architectured classes - Registers - INITIALISE.%n");
        stat_CLASS_get_Framework().dyn_REG_boot3_INITIALISE_Framework_App(stat_CLASS_get_Framework(), stat_CLASS_get_Framework().dyn_STRUCT_get_Input(), stat_CLASS_get_Framework().dyn_STRUCT_get_Output());
        stat_CLASS_get_Framework().dyn_CLASS_get_Framework_App().dyn_REG_boot3_INITIALISE_App(stat_CLASS_get_Framework());
        stat_CLASS_get_Framework().dyn_CLASS_get_Framework_App().dyn_CLASS_get_Algorithims().dyn_REG_boot3_INITIALISE_Algorithims(stat_CLASS_get_Framework());
        stat_CLASS_get_Framework().dyn_CLASS_get_Framework_App().dyn_CLASS_get_Data().dyn_REG_boot3_INITIALISE_Data(stat_CLASS_get_Framework());
        stat_CLASS_get_Framework().dyn_CLASS_get_Framework_App().dyn_CLASS_get_Data().dyn_CLASS_get_INSTANCE_Game().dyn_REG_boot3_INITIALISE_Game_Instance(stat_CLASS_get_Framework(), stat_CLASS_get_Framework().dyn_STRUCT_get_INSTANCE_Game().dyn_REG_get_Item_On_Array_Of_xboxController((char)0));

        stat_CLASS_get_Framework().dyn_CLASS_get_Framework_App().dyn_CLASS_get_Execute().dyn_REG_boot3_INITIALISE_Execute(stat_CLASS_get_Framework());
        System.out.printf("done architectured classes - Registers - INITIALISE.%n");
        System.out.printf("done ARCHITECTURE generate - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");

        System.out.printf("started PROGRAM - INSTANTIATE.%n");
        stat_CLASS_get_Framework().dyn_REG_boot4_INSTANTIATE_Framework_App(stat_CLASS_get_Framework());
        System.out.printf("done PROGRAM - INSTANTIATE.%n");

        System.out.printf("started PRIME Assembly.%n");
        stat_CLASS_get_Framework().dyn_CLASS_get_Framework_App().dyn_CLASS_get_Execute().dyn_APP_startThreads();
        System.out.printf("done PRIME Assembly.%n");
        System.out.printf("exiting DESKTOP APPLICATION generate_Program().%n");

        //todo system initialised flag check in while not wait loop
        return stat_CLASS_get_Framework();
    }
    public static Framework dyn_CLASS_get_Framework()
    {
        return stat_CLASS_get_Framework();
    }
    // private.
    private static void stat_CLASS_boot1_DEFINE_framework()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_framework().%n");
        _stat_CLASS_framework = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_framework().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_framework()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_framework().%n");
        _stat_CLASS_framework = new Framework();
        try {
            stat_CLASS_get_Framework();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_framework().%n");
    }
    private static Framework stat_CLASS_get_Framework()
    {
        return _stat_CLASS_framework;
    }
}