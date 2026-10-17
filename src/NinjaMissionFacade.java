public class NinjaMissionFacade {
    private JutsuService jutsuService;
    private EquipmentService equipmentService;
    private  MissionIntelService missionIntelService;
    private TeamCoordinationService teamCoordinationService;
    public NinjaMissionFacade(){
        jutsuService=new JutsuService();
        equipmentService=new EquipmentService();
        missionIntelService=new MissionIntelService();
        teamCoordinationService=new TeamCoordinationService();
    }
    public void prepareForMission(String ninjaName){
        if (ninjaName== null || ninjaName.isEmpty()){
            System.out.println("Error:Ninja name can't be empty,Dattebayo!");
            return;
        }
        System.out.println("Preparing " + ninjaName + " for an S-rank Mission ");
        jutsuService.trainJutsu(ninjaName);
        equipmentService.prepareGear();
        missionIntelService.gatherIntel();
        teamCoordinationService.coordinateteam(ninjaName);
        System.out.println("Ready for the mission!");
    }
}
