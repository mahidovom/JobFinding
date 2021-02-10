package com.bursi.jobfinding;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class getJobList {
    public static String[] setjobs(){

        String json="{\n" +
                "\t\"description\": \"A list of occupations (jobs that people might have).\",\n" +
                "\t\"occupations\":\n" +
                "\t[\n" +
                "\t\t\"accountant\",\n" +
                "\t\t\"actor\",\n" +
                "\t\t\"actuary\",\n" +
                "\t\t\"adhesive bonding machine tender\",\n" +
                "\t\t\"adjudicator\",\n" +
                "\t\t\"administrative assistant\",\n" +
                "\t\t\"administrative services manager\",\n" +
                "\t\t\"adult education teacher\",\n" +
                "\t\t\"advertising manager\",\n" +
                "\t\t\"advertising sales agent\",\n" +
                "\t\t\"aerobics instructor\",\n" +
                "\t\t\"aerospace engineer\",\n" +
                "\t\t\"aerospace engineering technician\",\n" +
                "\t\t\"agent\",\n" +
                "\t\t\"agricultural engineer\",\n" +
                "\t\t\"agricultural equipment operator\",\n" +
                "\t\t\"agricultural grader\",\n" +
                "\t\t\"agricultural inspector\",\n" +
                "\t\t\"agricultural manager\",\n" +
                "\t\t\"agricultural sciences teacher\",\n" +
                "\t\t\"agricultural sorter\",\n" +
                "\t\t\"agricultural technician\",\n" +
                "\t\t\"agricultural worker\",\n" +
                "\t\t\"air conditioning installer\",\n" +
                "\t\t\"air conditioning mechanic\",\n" +
                "\t\t\"air traffic controller\",\n" +
                "\t\t\"aircraft cargo handling supervisor\",\n" +
                "\t\t\"aircraft mechanic\",\n" +
                "\t\t\"aircraft service technician\",\n" +
                "\t\t\"airline copilot\",\n" +
                "\t\t\"airline pilot\",\n" +
                "\t\t\"ambulance dispatcher\",\n" +
                "\t\t\"ambulance driver\",\n" +
                "\t\t\"amusement machine servicer\",\n" +
                "\t\t\"anesthesiologist\",\n" +
                "\t\t\"animal breeder\",\n" +
                "\t\t\"animal control worker\",\n" +
                "\t\t\"animal scientist\",\n" +
                "\t\t\"animal trainer\",\n" +
                "\t\t\"animator\",\n" +
                "\t\t\"answering service operator\",\n" +
                "\t\t\"anthropologist\",\n" +
                "\t\t\"apparel patternmaker\",\n" +
                "\t\t\"apparel worker\",\n" +
                "\t\t\"arbitrator\",\n" +
                "\t\t\"archeologist\",\n" +
                "\t\t\"architect\",\n" +
                "\t\t\"architectural drafter\",\n" +
                "\t\t\"architectural manager\",\n" +
                "\t\t\"archivist\",\n" +
                "\t\t\"art director\",\n" +
                "\t\t\"art teacher\",\n" +
                "\t\t\"artist\",\n" +
                "\t\t\"assembler\",\n" +
                "\t\t\"astronomer\",\n" +
                "\t\t\"athlete\",\n" +
                "\t\t\"athletic trainer\",\n" +
                "\t\t\"ATM machine repairer\",\n" +
                "\t\t\"atmospheric scientist\",\n" +
                "\t\t\"attendant\",\n" +
                "\t\t\"audio and video equipment technician\",\n" +
                "\t\t\"audio-visual and multimedia collections specialist\",\n" +
                "\t\t\"audiologist\",\n" +
                "\t\t\"auditor\",\n" +
                "\t\t\"author\",\n" +
                "\t\t\"auto damage insurance appraiser\",\n" +
                "\t\t\"automotive and watercraft service attendant\",\n" +
                "\t\t\"automotive glass installer\",\n" +
                "\t\t\"automotive mechanic\",\n" +
                "\t\t\"avionics technician\",\n" +
                "\t\t\"baggage porter\",\n" +
                "\t\t\"bailiff\",\n" +
                "\t\t\"baker\",\n" +
                "\t\t\"barback\",\n" +
                "\t\t\"barber\",\n" +
                "\t\t\"bartender\",\n" +
                "\t\t\"basic education teacher\",\n" +
                "\t\t\"behavioral disorder counselor\",\n" +
                "\t\t\"bellhop\",\n" +
                "\t\t\"bench carpenter\",\n" +
                "\t\t\"bicycle repairer\",\n" +
                "\t\t\"bill and account collector\",\n" +
                "\t\t\"billing and posting clerk\",\n" +
                "\t\t\"biochemist\",\n" +
                "\t\t\"biological technician\",\n" +
                "\t\t\"biomedical engineer\",\n" +
                "\t\t\"biophysicist\",\n" +
                "\t\t\"blaster\",\n" +
                "\t\t\"blending machine operator\",\n" +
                "\t\t\"blockmason\",\n" +
                "\t\t\"boiler operator\",\n" +
                "\t\t\"boilermaker\",\n" +
                "\t\t\"bookkeeper\",\n" +
                "\t\t\"boring machine tool tender\",\n" +
                "\t\t\"brazer\",\n" +
                "\t\t\"brickmason\",\n" +
                "\t\t\"bridge and lock tender\",\n" +
                "\t\t\"broadcast news analyst\",\n" +
                "\t\t\"broadcast technician\",\n" +
                "\t\t\"brokerage clerk\",\n" +
                "\t\t\"budget analyst\",\n" +
                "\t\t\"building inspector\",\n" +
                "\t\t\"bus mechanic\",\n" +
                "\t\t\"butcher\",\n" +
                "\t\t\"buyer\",\n" +
                "\t\t\"cabinetmaker\",\n" +
                "\t\t\"cafeteria attendant\",\n" +
                "\t\t\"cafeteria cook\",\n" +
                "\t\t\"camera operator\",\n" +
                "\t\t\"camera repairer\",\n" +
                "\t\t\"cardiovascular technician\",\n" +
                "\t\t\"cargo agent\",\n" +
                "\t\t\"carpenter\",\n" +
                "\t\t\"carpet installer\",\n" +
                "\t\t\"cartographer\",\n" +
                "\t\t\"cashier\",\n" +
                "\t\t\"caster\",\n" +
                "\t\t\"ceiling tile installer\",\n" +
                "\t\t\"cellular equipment installer\",\n" +
                "\t\t\"cement mason\",\n" +
                "\t\t\"channeling machine operator\",\n" +
                "\t\t\"chauffeur\",\n" +
                "\t\t\"checker\",\n" +
                "\t\t\"chef\",\n" +
                "\t\t\"chemical engineer\",\n" +
                "\t\t\"chemical plant operator\",\n" +
                "\t\t\"chemist\",\n" +
                "\t\t\"chemistry teacher\",\n" +
                "\t\t\"chief executive\",\n" +
                "\t\t\"child social worker\",\n" +
                "\t\t\"childcare worker\",\n" +
                "\t\t\"chiropractor\",\n" +
                "\t\t\"choreographer\",\n" +
                "\t\t\"civil drafter\",\n" +
                "\t\t\"civil engineer\",\n" +
                "\t\t\"civil engineering technician\",\n" +
                "\t\t\"claims adjuster\",\n" +
                "\t\t\"claims examiner\",\n" +
                "\t\t\"claims investigator\",\n" +
                "\t\t\"cleaner\",\n" +
                "\t\t\"clinical laboratory technician\",\n" +
                "\t\t\"clinical laboratory technologist\",\n" +
                "\t\t\"clinical psychologist\",\n" +
                "\t\t\"coating worker\",\n" +
                "\t\t\"coatroom attendant\",\n" +
                "\t\t\"coil finisher\",\n" +
                "\t\t\"coil taper\",\n" +
                "\t\t\"coil winder\",\n" +
                "\t\t\"coin machine servicer\",\n" +
                "\t\t\"commercial diver\",\n" +
                "\t\t\"commercial pilot\",\n" +
                "\t\t\"commodities sales agent\",\n" +
                "\t\t\"communications equipment operator\",\n" +
                "\t\t\"communications teacher\",\n" +
                "\t\t\"community association manager\",\n" +
                "\t\t\"community service manager\",\n" +
                "\t\t\"compensation and benefits manager\",\n" +
                "\t\t\"compliance officer\",\n" +
                "\t\t\"composer\",\n" +
                "\t\t\"computer hardware engineer\",\n" +
                "\t\t\"computer network architect\",\n" +
                "\t\t\"computer operator\",\n" +
                "\t\t\"computer programmer\",\n" +
                "\t\t\"computer science teacher\",\n" +
                "\t\t\"computer support specialist\",\n" +
                "\t\t\"computer systems administrator\",\n" +
                "\t\t\"computer systems analyst\",\n" +
                "\t\t\"concierge\",\n" +
                "\t\t\"conciliator\",\n" +
                "\t\t\"concrete finisher\",\n" +
                "\t\t\"conservation science teacher\",\n" +
                "\t\t\"conservation scientist\",\n" +
                "\t\t\"conservation worker\",\n" +
                "\t\t\"conservator\",\n" +
                "\t\t\"construction inspector\",\n" +
                "\t\t\"construction manager\",\n" +
                "\t\t\"construction painter\",\n" +
                "\t\t\"construction worker\",\n" +
                "\t\t\"continuous mining machine operator\",\n" +
                "\t\t\"convention planner\",\n" +
                "\t\t\"conveyor operator\",\n" +
                "\t\t\"cook\",\n" +
                "\t\t\"cooling equipment operator\",\n" +
                "\t\t\"copy marker\",\n" +
                "\t\t\"correctional officer\",\n" +
                "\t\t\"correctional treatment specialist\",\n" +
                "\t\t\"correspondence clerk\",\n" +
                "\t\t\"correspondent\",\n" +
                "\t\t\"cosmetologist\",\n" +
                "\t\t\"cost estimator\",\n" +
                "\t\t\"costume attendant\",\n" +
                "\t\t\"counseling psychologist\",\n" +
                "\t\t\"counselor\",\n" +
                "\t\t\"courier\",\n" +
                "\t\t\"court reporter\",\n" +
                "\t\t\"craft artist\",\n" +
                "\t\t\"crane operator\",\n" +
                "\t\t\"credit analyst\",\n" +
                "\t\t\"credit checker\",\n" +
                "\t\t\"credit counselor\",\n" +
                "\t\t\"criminal investigator\",\n" +
                "\t\t\"criminal justice teacher\",\n" +
                "\t\t\"crossing guard\",\n" +
                "\t\t\"curator\",\n" +
                "\t\t\"custom sewer\",\n" +
                "\t\t\"customer service representative\",\n" +
                "\t\t\"cutter\",\n" +
                "\t\t\"cutting machine operator\",\n" +
                "\t\t\"dancer\",\n" +
                "\t\t\"data entry keyer\",\n" +
                "\t\t\"database administrator\",\n" +
                "\t\t\"decorating worker\",\n" +
                "\t\t\"delivery services driver\",\n" +
                "\t\t\"demonstrator\",\n" +
                "\t\t\"dental assistant\",\n" +
                "\t\t\"dental hygienist\",\n" +
                "\t\t\"dental laboratory technician\",\n" +
                "\t\t\"dentist\",\n" +
                "\t\t\"derrick operator\",\n" +
                "\t\t\"designer\",\n" +
                "\t\t\"desktop publisher\",\n" +
                "\t\t\"detective\",\n" +
                "\t\t\"diagnostic medical sonographer\",\n" +
                "\t\t\"die maker\",\n" +
                "\t\t\"diesel engine specialist\",\n" +
                "\t\t\"dietetic technician\",\n" +
                "\t\t\"dietitian\",\n" +
                "\t\t\"dinkey operator\",\n" +
                "\t\t\"director\",\n" +
                "\t\t\"dishwasher\",\n" +
                "\t\t\"dispatcher\",\n" +
                "\t\t\"door-to-door sales worker\",\n" +
                "\t\t\"drafter\",\n" +
                "\t\t\"dragline operator\",\n" +
                "\t\t\"drama teacher\",\n" +
                "\t\t\"dredge operator\",\n" +
                "\t\t\"dressing room attendant\",\n" +
                "\t\t\"dressmaker\",\n" +
                "\t\t\"drier operator\",\n" +
                "\t\t\"drilling machine tool operator\",\n" +
                "\t\t\"dry-cleaning worker\",\n" +
                "\t\t\"drywall installer\",\n" +
                "\t\t\"dyeing machine operator\",\n" +
                "\t\t\"earth driller\",\n" +
                "\t\t\"economics teacher\",\n" +
                "\t\t\"economist\",\n" +
                "\t\t\"editor\",\n" +
                "\t\t\"education administrator\",\n" +
                "\t\t\"electric motor repairer\",\n" +
                "\t\t\"electrical electronics drafter\",\n" +
                "\t\t\"electrical engineer\",\n" +
                "\t\t\"electrical equipment assembler\",\n" +
                "\t\t\"electrical installer\",\n" +
                "\t\t\"electrical power-line installer\",\n" +
                "\t\t\"electrician\",\n" +
                "\t\t\"electro-mechanical technician\",\n" +
                "\t\t\"elementary school teacher\",\n" +
                "\t\t\"elevator installer\",\n" +
                "\t\t\"elevator repairer\",\n" +
                "\t\t\"embalmer\",\n" +
                "\t\t\"emergency management director\",\n" +
                "\t\t\"emergency medical technician\",\n" +
                "\t\t\"engine assembler\",\n" +
                "\t\t\"engineer\",\n" +
                "\t\t\"engineering manager\",\n" +
                "\t\t\"engineering teacher\",\n" +
                "\t\t\"english language teacher\",\n" +
                "\t\t\"engraver\",\n" +
                "\t\t\"entertainment attendant\",\n" +
                "\t\t\"environmental engineer\",\n" +
                "\t\t\"environmental science teacher\",\n" +
                "\t\t\"environmental scientist\",\n" +
                "\t\t\"epidemiologist\",\n" +
                "\t\t\"escort\",\n" +
                "\t\t\"etcher\",\n" +
                "\t\t\"event planner\",\n" +
                "\t\t\"excavating operator\",\n" +
                "\t\t\"executive administrative assistant\",\n" +
                "\t\t\"executive secretary\",\n" +
                "\t\t\"exhibit designer\",\n" +
                "\t\t\"expediting clerk\",\n" +
                "\t\t\"explosives worker\",\n" +
                "\t\t\"extraction worker\",\n" +
                "\t\t\"fabric mender\",\n" +
                "\t\t\"fabric patternmaker\",\n" +
                "\t\t\"fabricator\",\n" +
                "\t\t\"faller\",\n" +
                "\t\t\"family practitioner\",\n" +
                "\t\t\"family social worker\",\n" +
                "\t\t\"family therapist\",\n" +
                "\t\t\"farm advisor\",\n" +
                "\t\t\"farm equipment mechanic\",\n" +
                "\t\t\"farm labor contractor\",\n" +
                "\t\t\"farmer\",\n" +
                "\t\t\"farmworker\",\n" +
                "\t\t\"fashion designer\",\n" +
                "\t\t\"fast food cook\",\n" +
                "\t\t\"fence erector\",\n" +
                "\t\t\"fiberglass fabricator\",\n" +
                "\t\t\"fiberglass laminator\",\n" +
                "\t\t\"file clerk\",\n" +
                "\t\t\"filling machine operator\",\n" +
                "\t\t\"film and video editor\",\n" +
                "\t\t\"financial analyst\",\n" +
                "\t\t\"financial examiner\",\n" +
                "\t\t\"financial manager\",\n" +
                "\t\t\"financial services sales agent\",\n" +
                "\t\t\"fine artist\",\n" +
                "\t\t\"fire alarm system installer\",\n" +
                "\t\t\"fire dispatcher\",\n" +
                "\t\t\"fire inspector\",\n" +
                "\t\t\"fire investigator\",\n" +
                "\t\t\"firefighter\",\n" +
                "\t\t\"fish and game warden\",\n" +
                "\t\t\"fish cutter\",\n" +
                "\t\t\"fish trimmer\",\n" +
                "\t\t\"fisher\",\n" +
                "\t\t\"fitness studies teacher\",\n" +
                "\t\t\"fitness trainer\",\n" +
                "\t\t\"flight attendant\",\n" +
                "\t\t\"floor finisher\",\n" +
                "\t\t\"floor layer\",\n" +
                "\t\t\"floor sander\",\n" +
                "\t\t\"floral designer\",\n" +
                "\t\t\"food batchmaker\",\n" +
                "\t\t\"food cooking machine operator\",\n" +
                "\t\t\"food preparation worker\",\n" +
                "\t\t\"food science technician\",\n" +
                "\t\t\"food scientist\",\n" +
                "\t\t\"food server\",\n" +
                "\t\t\"food service manager\",\n" +
                "\t\t\"food technologist\",\n" +
                "\t\t\"foreign language teacher\",\n" +
                "\t\t\"foreign literature teacher\",\n" +
                "\t\t\"forensic science technician\",\n" +
                "\t\t\"forest fire inspector\",\n" +
                "\t\t\"forest fire prevention specialist\",\n" +
                "\t\t\"forest worker\",\n" +
                "\t\t\"forester\",\n" +
                "\t\t\"forestry teacher\",\n" +
                "\t\t\"forging machine setter\",\n" +
                "\t\t\"foundry coremaker\",\n" +
                "\t\t\"freight agent\",\n" +
                "\t\t\"freight mover\",\n" +
                "\t\t\"fundraising manager\",\n" +
                "\t\t\"funeral attendant\",\n" +
                "\t\t\"funeral director\",\n" +
                "\t\t\"funeral service manager\",\n" +
                "\t\t\"furnace operator\",\n" +
                "\t\t\"furnishings worker\",\n" +
                "\t\t\"furniture finisher\",\n" +
                "\t\t\"gaming booth cashier\",\n" +
                "\t\t\"gaming cage worker\",\n" +
                "\t\t\"gaming change person\",\n" +
                "\t\t\"gaming dealer\",\n" +
                "\t\t\"gaming investigator\",\n" +
                "\t\t\"gaming manager\",\n" +
                "\t\t\"gaming surveillance officer\",\n" +
                "\t\t\"garment mender\",\n" +
                "\t\t\"garment presser\",\n" +
                "\t\t\"gas compressor\",\n" +
                "\t\t\"gas plant operator\",\n" +
                "\t\t\"gas pumping station operator\",\n" +
                "\t\t\"general manager\",\n" +
                "\t\t\"general practitioner\",\n" +
                "\t\t\"geographer\",\n" +
                "\t\t\"geography teacher\",\n" +
                "\t\t\"geological engineer\",\n" +
                "\t\t\"geological technician\",\n" +
                "\t\t\"geoscientist\",\n" +
                "\t\t\"glazier\",\n" +
                "\t\t\"government program eligibility interviewer\",\n" +
                "\t\t\"graduate teaching assistant\",\n" +
                "\t\t\"graphic designer\",\n" +
                "\t\t\"groundskeeper\",\n" +
                "\t\t\"groundskeeping worker\",\n" +
                "\t\t\"gynecologist\",\n" +
                "\t\t\"hairdresser\",\n" +
                "\t\t\"hairstylist\",\n" +
                "\t\t\"hand grinding worker\",\n" +
                "\t\t\"hand laborer\",\n" +
                "\t\t\"hand packager\",\n" +
                "\t\t\"hand packer\",\n" +
                "\t\t\"hand polishing worker\",\n" +
                "\t\t\"hand sewer\",\n" +
                "\t\t\"hazardous materials removal worker\",\n" +
                "\t\t\"head cook\",\n" +
                "\t\t\"health and safety engineer\",\n" +
                "\t\t\"health educator\",\n" +
                "\t\t\"health information technician\",\n" +
                "\t\t\"health services manager\",\n" +
                "\t\t\"health specialties teacher\",\n" +
                "\t\t\"healthcare social worker\",\n" +
                "\t\t\"hearing officer\",\n" +
                "\t\t\"heat treating equipment setter\",\n" +
                "\t\t\"heating installer\",\n" +
                "\t\t\"heating mechanic\",\n" +
                "\t\t\"heavy truck driver\",\n" +
                "\t\t\"highway maintenance worker\",\n" +
                "\t\t\"historian\",\n" +
                "\t\t\"history teacher\",\n" +
                "\t\t\"hoist and winch operator\",\n" +
                "\t\t\"home appliance repairer\",\n" +
                "\t\t\"home economics teacher\",\n" +
                "\t\t\"home entertainment installer\",\n" +
                "\t\t\"home health aide\",\n" +
                "\t\t\"home management advisor\",\n" +
                "\t\t\"host\",\n" +
                "\t\t\"hostess\",\n" +
                "\t\t\"hostler\",\n" +
                "\t\t\"hotel desk clerk\",\n" +
                "\t\t\"housekeeping cleaner\",\n" +
                "\t\t\"human resources assistant\",\n" +
                "\t\t\"human resources manager\",\n" +
                "\t\t\"human service assistant\",\n" +
                "\t\t\"hunter\",\n" +
                "\t\t\"hydrologist\",\n" +
                "\t\t\"illustrator\",\n" +
                "\t\t\"industrial designer\",\n" +
                "\t\t\"industrial engineer\",\n" +
                "\t\t\"industrial engineering technician\",\n" +
                "\t\t\"industrial machinery mechanic\",\n" +
                "\t\t\"industrial production manager\",\n" +
                "\t\t\"industrial truck operator\",\n" +
                "\t\t\"industrial-organizational psychologist\",\n" +
                "\t\t\"information clerk\",\n" +
                "\t\t\"information research scientist\",\n" +
                "\t\t\"information security analyst\",\n" +
                "\t\t\"information systems manager\",\n" +
                "\t\t\"inspector\",\n" +
                "\t\t\"instructional coordinator\",\n" +
                "\t\t\"instructor\",\n" +
                "\t\t\"insulation worker\",\n" +
                "\t\t\"insurance claims clerk\",\n" +
                "\t\t\"insurance sales agent\",\n" +
                "\t\t\"insurance underwriter\",\n" +
                "\t\t\"intercity bus driver\",\n" +
                "\t\t\"interior designer\",\n" +
                "\t\t\"internist\",\n" +
                "\t\t\"interpreter\",\n" +
                "\t\t\"interviewer\",\n" +
                "\t\t\"investigator\",\n" +
                "\t\t\"jailer\",\n" +
                "\t\t\"janitor\",\n" +
                "\t\t\"jeweler\",\n" +
                "\t\t\"judge\",\n" +
                "\t\t\"judicial law clerk\",\n" +
                "\t\t\"kettle operator\",\n" +
                "\t\t\"kiln operator\",\n" +
                "\t\t\"kindergarten teacher\",\n" +
                "\t\t\"laboratory animal caretaker\",\n" +
                "\t\t\"landscape architect\",\n" +
                "\t\t\"landscaping worker\",\n" +
                "\t\t\"lathe setter\",\n" +
                "\t\t\"laundry worker\",\n" +
                "\t\t\"law enforcement teacher\",\n" +
                "\t\t\"law teacher\",\n" +
                "\t\t\"lawyer\",\n" +
                "\t\t\"layout worker\",\n" +
                "\t\t\"leather worker\",\n" +
                "\t\t\"legal assistant\",\n" +
                "\t\t\"legal secretary\",\n" +
                "\t\t\"legislator\",\n" +
                "\t\t\"librarian\",\n" +
                "\t\t\"library assistant\",\n" +
                "\t\t\"library science teacher\",\n" +
                "\t\t\"library technician\",\n" +
                "\t\t\"licensed practical nurse\",\n" +
                "\t\t\"licensed vocational nurse\",\n" +
                "\t\t\"life scientist\",\n" +
                "\t\t\"lifeguard\",\n" +
                "\t\t\"light truck driver\",\n" +
                "\t\t\"line installer\",\n" +
                "\t\t\"literacy teacher\",\n" +
                "\t\t\"literature teacher\",\n" +
                "\t\t\"loading machine operator\",\n" +
                "\t\t\"loan clerk\",\n" +
                "\t\t\"loan interviewer\",\n" +
                "\t\t\"loan officer\",\n" +
                "\t\t\"lobby attendant\",\n" +
                "\t\t\"locker room attendant\",\n" +
                "\t\t\"locksmith\",\n" +
                "\t\t\"locomotive engineer\",\n" +
                "\t\t\"locomotive firer\",\n" +
                "\t\t\"lodging manager\",\n" +
                "\t\t\"log grader\",\n" +
                "\t\t\"logging equipment operator\",\n" +
                "\t\t\"logistician\",\n" +
                "\t\t\"machine feeder\",\n" +
                "\t\t\"machinist\",\n" +
                "\t\t\"magistrate judge\",\n" +
                "\t\t\"magistrate\",\n" +
                "\t\t\"maid\",\n" +
                "\t\t\"mail clerk\",\n" +
                "\t\t\"mail machine operator\",\n" +
                "\t\t\"mail superintendent\",\n" +
                "\t\t\"maintenance painter\",\n" +
                "\t\t\"maintenance worker\",\n" +
                "\t\t\"makeup artist\",\n" +
                "\t\t\"management analyst\",\n" +
                "\t\t\"manicurist\",\n" +
                "\t\t\"manufactured building installer\",\n" +
                "\t\t\"mapping technician\",\n" +
                "\t\t\"marble setter\",\n" +
                "\t\t\"marine engineer\",\n" +
                "\t\t\"marine oiler\",\n" +
                "\t\t\"market research analyst\",\n" +
                "\t\t\"marketing manager\",\n" +
                "\t\t\"marketing specialist\",\n" +
                "\t\t\"marriage therapist\",\n" +
                "\t\t\"massage therapist\",\n" +
                "\t\t\"material mover\",\n" +
                "\t\t\"materials engineer\",\n" +
                "\t\t\"materials scientist\",\n" +
                "\t\t\"mathematical science teacher\",\n" +
                "\t\t\"mathematical technician\",\n" +
                "\t\t\"mathematician\",\n" +
                "\t\t\"maxillofacial surgeon\",\n" +
                "\t\t\"measurer\",\n" +
                "\t\t\"meat cutter\",\n" +
                "\t\t\"meat packer\",\n" +
                "\t\t\"meat trimmer\",\n" +
                "\t\t\"mechanical door repairer\",\n" +
                "\t\t\"mechanical drafter\",\n" +
                "\t\t\"mechanical engineer\",\n" +
                "\t\t\"mechanical engineering technician\",\n" +
                "\t\t\"mediator\",\n" +
                "\t\t\"medical appliance technician\",\n" +
                "\t\t\"medical assistant\",\n" +
                "\t\t\"medical equipment preparer\",\n" +
                "\t\t\"medical equipment repairer\",\n" +
                "\t\t\"medical laboratory technician\",\n" +
                "\t\t\"medical laboratory technologist\",\n" +
                "\t\t\"medical records technician\",\n" +
                "\t\t\"medical scientist\",\n" +
                "\t\t\"medical secretary\",\n" +
                "\t\t\"medical services manager\",\n" +
                "\t\t\"medical transcriptionist\",\n" +
                "\t\t\"meeting planner\",\n" +
                "\t\t\"mental health counselor\",\n" +
                "\t\t\"mental health social worker\",\n" +
                "\t\t\"merchandise displayer\",\n" +
                "\t\t\"messenger\",\n" +
                "\t\t\"metal caster\",\n" +
                "\t\t\"metal patternmaker\",\n" +
                "\t\t\"metal pickling operator\",\n" +
                "\t\t\"metal pourer\",\n" +
                "\t\t\"metal worker\",\n" +
                "\t\t\"metal-refining furnace operator\",\n" +
                "\t\t\"metal-refining furnace tender\",\n" +
                "\t\t\"meter reader\",\n" +
                "\t\t\"microbiologist\",\n" +
                "\t\t\"middle school teacher\",\n" +
                "\t\t\"milling machine setter\",\n" +
                "\t\t\"millwright\",\n" +
                "\t\t\"mine cutting machine operator\",\n" +
                "\t\t\"mine shuttle car operator\",\n" +
                "\t\t\"mining engineer\",\n" +
                "\t\t\"mining safety engineer\",\n" +
                "\t\t\"mining safety inspector\",\n" +
                "\t\t\"mining service unit operator\",\n" +
                "\t\t\"mixing machine setter\",\n" +
                "\t\t\"mobile heavy equipment mechanic\",\n" +
                "\t\t\"mobile home installer\",\n" +
                "\t\t\"model maker\",\n" +
                "\t\t\"model\",\n" +
                "\t\t\"molder\",\n" +
                "\t\t\"mortician\",\n" +
                "\t\t\"motel desk clerk\",\n" +
                "\t\t\"motion picture projectionist\",\n" +
                "\t\t\"motorboat mechanic\",\n" +
                "\t\t\"motorboat operator\",\n" +
                "\t\t\"motorboat service technician\",\n" +
                "\t\t\"motorcycle mechanic\",\n" +
                "\t\t\"multimedia artist\",\n" +
                "\t\t\"museum technician\",\n" +
                "\t\t\"music director\",\n" +
                "\t\t\"music teacher\",\n" +
                "\t\t\"musical instrument repairer\",\n" +
                "\t\t\"musician\",\n" +
                "\t\t\"natural sciences manager\",\n" +
                "\t\t\"naval architect\",\n" +
                "\t\t\"network systems administrator\",\n" +
                "\t\t\"new accounts clerk\",\n" +
                "\t\t\"news vendor\",\n" +
                "\t\t\"nonfarm animal caretaker\",\n" +
                "\t\t\"nuclear engineer\",\n" +
                "\t\t\"nuclear medicine technologist\",\n" +
                "\t\t\"nuclear power reactor operator\",\n" +
                "\t\t\"nuclear technician\",\n" +
                "\t\t\"nursing aide\",\n" +
                "\t\t\"nursing instructor\",\n" +
                "\t\t\"nursing teacher\",\n" +
                "\t\t\"nutritionist\",\n" +
                "\t\t\"obstetrician\",\n" +
                "\t\t\"occupational health and safety specialist\",\n" +
                "\t\t\"occupational health and safety technician\",\n" +
                "\t\t\"occupational therapist\",\n" +
                "\t\t\"occupational therapy aide\",\n" +
                "\t\t\"occupational therapy assistant\",\n" +
                "\t\t\"offbearer\",\n" +
                "\t\t\"office clerk\",\n" +
                "\t\t\"office machine operator\",\n" +
                "\t\t\"operating engineer\",\n" +
                "\t\t\"operations manager\",\n" +
                "\t\t\"operations research analyst\",\n" +
                "\t\t\"ophthalmic laboratory technician\",\n" +
                "\t\t\"optician\",\n" +
                "\t\t\"optometrist\",\n" +
                "\t\t\"oral surgeon\",\n" +
                "\t\t\"order clerk\",\n" +
                "\t\t\"order filler\",\n" +
                "\t\t\"orderly\",\n" +
                "\t\t\"ordnance handling expert\",\n" +
                "\t\t\"orthodontist\",\n" +
                "\t\t\"orthotist\",\n" +
                "\t\t\"outdoor power equipment mechanic\",\n" +
                "\t\t\"oven operator\",\n" +
                "\t\t\"packaging machine operator\",\n" +
                "\t\t\"painter \",\n" +
                "\t\t\"painting worker\",\n" +
                "\t\t\"paper goods machine setter\",\n" +
                "\t\t\"paperhanger\",\n" +
                "\t\t\"paralegal\",\n" +
                "\t\t\"paramedic\",\n" +
                "\t\t\"parking enforcement worker\",\n" +
                "\t\t\"parking lot attendant\",\n" +
                "\t\t\"parts salesperson\",\n" +
                "\t\t\"paving equipment operator\",\n" +
                "\t\t\"payroll clerk\",\n" +
                "\t\t\"pediatrician\",\n" +
                "\t\t\"pedicurist\",\n" +
                "\t\t\"personal care aide\",\n" +
                "\t\t\"personal chef\",\n" +
                "\t\t\"personal financial advisor\",\n" +
                "\t\t\"pest control worker\",\n" +
                "\t\t\"pesticide applicator\",\n" +
                "\t\t\"pesticide handler\",\n" +
                "\t\t\"pesticide sprayer\",\n" +
                "\t\t\"petroleum engineer\",\n" +
                "\t\t\"petroleum gauger\",\n" +
                "\t\t\"petroleum pump system operator\",\n" +
                "\t\t\"petroleum refinery operator\",\n" +
                "\t\t\"petroleum technician\",\n" +
                "\t\t\"pharmacist\",\n" +
                "\t\t\"pharmacy aide\",\n" +
                "\t\t\"pharmacy technician\",\n" +
                "\t\t\"philosophy teacher\",\n" +
                "\t\t\"photogrammetrist\",\n" +
                "\t\t\"photographer\",\n" +
                "\t\t\"photographic process worker\",\n" +
                "\t\t\"photographic processing machine operator\",\n" +
                "\t\t\"physical therapist aide\",\n" +
                "\t\t\"physical therapist assistant\",\n" +
                "\t\t\"physical therapist\",\n" +
                "\t\t\"physician assistant\",\n" +
                "\t\t\"physician\",\n" +
                "\t\t\"physicist\",\n" +
                "\t\t\"physics teacher\",\n" +
                "\t\t\"pile-driver operator\",\n" +
                "\t\t\"pipefitter\",\n" +
                "\t\t\"pipelayer\",\n" +
                "\t\t\"planing machine operator\",\n" +
                "\t\t\"planning clerk\",\n" +
                "\t\t\"plant operator\",\n" +
                "\t\t\"plant scientist\",\n" +
                "\t\t\"plasterer\",\n" +
                "\t\t\"plastic patternmaker\",\n" +
                "\t\t\"plastic worker\",\n" +
                "\t\t\"plumber\",\n" +
                "\t\t\"podiatrist\",\n" +
                "\t\t\"police dispatcher\",\n" +
                "\t\t\"police officer\",\n" +
                "\t\t\"policy processing clerk\",\n" +
                "\t\t\"political science teacher\",\n" +
                "\t\t\"political scientist\",\n" +
                "\t\t\"postal service clerk\",\n" +
                "\t\t\"postal service mail carrier\",\n" +
                "\t\t\"postal service mail processing machine operator\",\n" +
                "\t\t\"postal service mail processor\",\n" +
                "\t\t\"postal service mail sorter\",\n" +
                "\t\t\"postmaster\",\n" +
                "\t\t\"postsecondary teacher\",\n" +
                "\t\t\"poultry cutter\",\n" +
                "\t\t\"poultry trimmer\",\n" +
                "\t\t\"power dispatcher\",\n" +
                "\t\t\"power distributor\",\n" +
                "\t\t\"power plant operator\",\n" +
                "\t\t\"power tool repairer\",\n" +
                "\t\t\"precious stone worker\",\n" +
                "\t\t\"precision instrument repairer\",\n" +
                "\t\t\"prepress technician\",\n" +
                "\t\t\"preschool teacher\",\n" +
                "\t\t\"priest\",\n" +
                "\t\t\"print binding worker\",\n" +
                "\t\t\"printing press operator\",\n" +
                "\t\t\"private detective\",\n" +
                "\t\t\"probation officer\",\n" +
                "\t\t\"procurement clerk\",\n" +
                "\t\t\"producer\",\n" +
                "\t\t\"product promoter\",\n" +
                "\t\t\"production clerk\",\n" +
                "\t\t\"production occupation\",\n" +
                "\t\t\"proofreader\",\n" +
                "\t\t\"property manager\",\n" +
                "\t\t\"prosthetist\",\n" +
                "\t\t\"prosthodontist\",\n" +
                "\t\t\"psychiatric aide\",\n" +
                "\t\t\"psychiatric technician\",\n" +
                "\t\t\"psychiatrist\",\n" +
                "\t\t\"psychologist\",\n" +
                "\t\t\"psychology teacher\",\n" +
                "\t\t\"public relations manager\",\n" +
                "\t\t\"public relations specialist\",\n" +
                "\t\t\"pump operator\",\n" +
                "\t\t\"purchasing agent\",\n" +
                "\t\t\"purchasing manager\",\n" +
                "\t\t\"radiation therapist\",\n" +
                "\t\t\"radio announcer\",\n" +
                "\t\t\"radio equipment installer\",\n" +
                "\t\t\"radio operator\",\n" +
                "\t\t\"radiologic technician\",\n" +
                "\t\t\"radiologic technologist\",\n" +
                "\t\t\"rail car repairer\",\n" +
                "\t\t\"rail transportation worker\",\n" +
                "\t\t\"rail yard engineer\",\n" +
                "\t\t\"rail-track laying equipment operator\",\n" +
                "\t\t\"railroad brake operator\",\n" +
                "\t\t\"railroad conductor\",\n" +
                "\t\t\"railroad police\",\n" +
                "\t\t\"rancher\",\n" +
                "\t\t\"real estate appraiser\",\n" +
                "\t\t\"real estate broker\",\n" +
                "\t\t\"real estate manager\",\n" +
                "\t\t\"real estate sales agent\",\n" +
                "\t\t\"receiving clerk\",\n" +
                "\t\t\"receptionist\",\n" +
                "\t\t\"record clerk\",\n" +
                "\t\t\"recreation teacher\",\n" +
                "\t\t\"recreation worker\",\n" +
                "\t\t\"recreational therapist\",\n" +
                "\t\t\"recreational vehicle service technician\",\n" +
                "\t\t\"recyclable material collector\",\n" +
                "\t\t\"referee\",\n" +
                "\t\t\"refractory materials repairer\",\n" +
                "\t\t\"refrigeration installer\",\n" +
                "\t\t\"refrigeration mechanic\",\n" +
                "\t\t\"refuse collector\",\n" +
                "\t\t\"regional planner\",\n" +
                "\t\t\"registered nurse\",\n" +
                "\t\t\"rehabilitation counselor\",\n" +
                "\t\t\"reinforcing iron worker\",\n" +
                "\t\t\"reinforcing rebar worker\",\n" +
                "\t\t\"religion teacher\",\n" +
                "\t\t\"religious activities director\",\n" +
                "\t\t\"religious worker\",\n" +
                "\t\t\"rental clerk\",\n" +
                "\t\t\"repair worker\",\n" +
                "\t\t\"reporter\",\n" +
                "\t\t\"residential advisor\",\n" +
                "\t\t\"resort desk clerk\",\n" +
                "\t\t\"respiratory therapist\",\n" +
                "\t\t\"respiratory therapy technician\",\n" +
                "\t\t\"retail buyer\",\n" +
                "\t\t\"retail salesperson\",\n" +
                "\t\t\"revenue agent\",\n" +
                "\t\t\"rigger\",\n" +
                "\t\t\"rock splitter\",\n" +
                "\t\t\"rolling machine tender\",\n" +
                "\t\t\"roof bolter\",\n" +
                "\t\t\"roofer\",\n" +
                "\t\t\"rotary drill operator\",\n" +
                "\t\t\"roustabout\",\n" +
                "\t\t\"safe repairer\",\n" +
                "\t\t\"sailor\",\n" +
                "\t\t\"sales engineer\",\n" +
                "\t\t\"sales manager\",\n" +
                "\t\t\"sales representative\",\n" +
                "\t\t\"sampler\",\n" +
                "\t\t\"sawing machine operator\",\n" +
                "\t\t\"scaler\",\n" +
                "\t\t\"school bus driver\",\n" +
                "\t\t\"school psychologist\",\n" +
                "\t\t\"school social worker\",\n" +
                "\t\t\"scout leader\",\n" +
                "\t\t\"sculptor\",\n" +
                "\t\t\"secondary education teacher\",\n" +
                "\t\t\"secondary school teacher\",\n" +
                "\t\t\"secretary\",\n" +
                "\t\t\"securities sales agent\",\n" +
                "\t\t\"security guard\",\n" +
                "\t\t\"security system installer\",\n" +
                "\t\t\"segmental paver\",\n" +
                "\t\t\"self-enrichment education teacher\",\n" +
                "\t\t\"semiconductor processor\",\n" +
                "\t\t\"septic tank servicer\",\n" +
                "\t\t\"set designer\",\n" +
                "\t\t\"sewer pipe cleaner\",\n" +
                "\t\t\"sewing machine operator\",\n" +
                "\t\t\"shampooer\",\n" +
                "\t\t\"shaper\",\n" +
                "\t\t\"sheet metal worker\",\n" +
                "\t\t\"sheriff's patrol officer\",\n" +
                "\t\t\"ship captain\",\n" +
                "\t\t\"ship engineer\",\n" +
                "\t\t\"ship loader\",\n" +
                "\t\t\"shipmate\",\n" +
                "\t\t\"shipping clerk\",\n" +
                "\t\t\"shoe machine operator\",\n" +
                "\t\t\"shoe worker\",\n" +
                "\t\t\"short order cook\",\n" +
                "\t\t\"signal operator\",\n" +
                "\t\t\"signal repairer\",\n" +
                "\t\t\"singer\",\n" +
                "\t\t\"ski patrol\",\n" +
                "\t\t\"skincare specialist\",\n" +
                "\t\t\"slaughterer\",\n" +
                "\t\t\"slicing machine tender\",\n" +
                "\t\t\"slot supervisor\",\n" +
                "\t\t\"social science research assistant\",\n" +
                "\t\t\"social sciences teacher\",\n" +
                "\t\t\"social scientist\",\n" +
                "\t\t\"social service assistant\",\n" +
                "\t\t\"social service manager\",\n" +
                "\t\t\"social work teacher\",\n" +
                "\t\t\"social worker\",\n" +
                "\t\t\"sociologist\",\n" +
                "\t\t\"sociology teacher\",\n" +
                "\t\t\"software developer\",\n" +
                "\t\t\"software engineer\",\n" +
                "\t\t\"soil scientist\",\n" +
                "\t\t\"solderer\",\n" +
                "\t\t\"sorter\",\n" +
                "\t\t\"sound engineering technician\",\n" +
                "\t\t\"space scientist\",\n" +
                "\t\t\"special education teacher\",\n" +
                "\t\t\"speech-language pathologist\",\n" +
                "\t\t\"sports book runner\",\n" +
                "\t\t\"sports entertainer\",\n" +
                "\t\t\"sports performer\",\n" +
                "\t\t\"stationary engineer\",\n" +
                "\t\t\"statistical assistant\",\n" +
                "\t\t\"statistician\",\n" +
                "\t\t\"steamfitter\",\n" +
                "\t\t\"stock clerk\",\n" +
                "\t\t\"stock mover\",\n" +
                "\t\t\"stonemason\",\n" +
                "\t\t\"street vendor\",\n" +
                "\t\t\"streetcar operator\",\n" +
                "\t\t\"structural iron worker\",\n" +
                "\t\t\"structural metal fabricator\",\n" +
                "\t\t\"structural metal fitter\",\n" +
                "\t\t\"structural steel worker\",\n" +
                "\t\t\"stucco mason\",\n" +
                "\t\t\"substance abuse counselor\",\n" +
                "\t\t\"substance abuse social worker\",\n" +
                "\t\t\"subway operator\",\n" +
                "\t\t\"surfacing equipment operator\",\n" +
                "\t\t\"surgeon\",\n" +
                "\t\t\"surgical technologist\",\n" +
                "\t\t\"survey researcher\",\n" +
                "\t\t\"surveying technician\",\n" +
                "\t\t\"surveyor\",\n" +
                "\t\t\"switch operator\",\n" +
                "\t\t\"switchboard operator\",\n" +
                "\t\t\"tailor\",\n" +
                "\t\t\"tamping equipment operator\",\n" +
                "\t\t\"tank car loader\",\n" +
                "\t\t\"taper\",\n" +
                "\t\t\"tax collector\",\n" +
                "\t\t\"tax examiner\",\n" +
                "\t\t\"tax preparer\",\n" +
                "\t\t\"taxi driver\",\n" +
                "\t\t\"teacher assistant\",\n" +
                "\t\t\"teacher\",\n" +
                "\t\t\"team assembler\",\n" +
                "\t\t\"technical writer\",\n" +
                "\t\t\"telecommunications equipment installer\",\n" +
                "\t\t\"telemarketer\",\n" +
                "\t\t\"telephone operator\",\n" +
                "\t\t\"television announcer\",\n" +
                "\t\t\"teller\",\n" +
                "\t\t\"terrazzo finisher\",\n" +
                "\t\t\"terrazzo worker\",\n" +
                "\t\t\"tester\",\n" +
                "\t\t\"textile bleaching operator\",\n" +
                "\t\t\"textile cutting machine setter\",\n" +
                "\t\t\"textile knitting machine setter\",\n" +
                "\t\t\"textile presser\",\n" +
                "\t\t\"textile worker\",\n" +
                "\t\t\"therapist\",\n" +
                "\t\t\"ticket agent\",\n" +
                "\t\t\"ticket taker\",\n" +
                "\t\t\"tile setter\",\n" +
                "\t\t\"timekeeping clerk\",\n" +
                "\t\t\"timing device assembler\",\n" +
                "\t\t\"tire builder\",\n" +
                "\t\t\"tire changer\",\n" +
                "\t\t\"tire repairer\",\n" +
                "\t\t\"title abstractor\",\n" +
                "\t\t\"title examiner\",\n" +
                "\t\t\"title searcher\",\n" +
                "\t\t\"tobacco roasting machine operator\",\n" +
                "\t\t\"tool filer\",\n" +
                "\t\t\"tool grinder\",\n" +
                "\t\t\"tool maker\",\n" +
                "\t\t\"tool sharpener\",\n" +
                "\t\t\"tour guide\",\n" +
                "\t\t\"tower equipment installer\",\n" +
                "\t\t\"tower operator\",\n" +
                "\t\t\"track switch repairer\",\n" +
                "\t\t\"tractor operator\",\n" +
                "\t\t\"tractor-trailer truck driver\",\n" +
                "\t\t\"traffic clerk\",\n" +
                "\t\t\"traffic technician\",\n" +
                "\t\t\"training and development manager\",\n" +
                "\t\t\"training and development specialist\",\n" +
                "\t\t\"transit police\",\n" +
                "\t\t\"translator\",\n" +
                "\t\t\"transportation equipment painter\",\n" +
                "\t\t\"transportation inspector\",\n" +
                "\t\t\"transportation security screener\",\n" +
                "\t\t\"transportation worker\",\n" +
                "\t\t\"trapper\",\n" +
                "\t\t\"travel agent\",\n" +
                "\t\t\"travel clerk\",\n" +
                "\t\t\"travel guide\",\n" +
                "\t\t\"tree pruner\",\n" +
                "\t\t\"tree trimmer\",\n" +
                "\t\t\"trimmer\",\n" +
                "\t\t\"truck loader\",\n" +
                "\t\t\"truck mechanic\",\n" +
                "\t\t\"tuner\",\n" +
                "\t\t\"turning machine tool operator\",\n" +
                "\t\t\"typist\",\n" +
                "\t\t\"umpire\",\n" +
                "\t\t\"undertaker\",\n" +
                "\t\t\"upholsterer\",\n" +
                "\t\t\"urban planner\",\n" +
                "\t\t\"usher\",\n" +
                "\t\t\"valve installer\",\n" +
                "\t\t\"vending machine servicer\",\n" +
                "\t\t\"veterinarian\",\n" +
                "\t\t\"veterinary assistant\",\n" +
                "\t\t\"veterinary technician\",\n" +
                "\t\t\"vocational counselor\",\n" +
                "\t\t\"vocational education teacher\",\n" +
                "\t\t\"waiter\",\n" +
                "\t\t\"waitress\",\n" +
                "\t\t\"watch repairer\",\n" +
                "\t\t\"water treatment plant operator\",\n" +
                "\t\t\"weaving machine setter\",\n" +
                "\t\t\"web developer\",\n" +
                "\t\t\"weigher\",\n" +
                "\t\t\"welder\",\n" +
                "\t\t\"wellhead pumper\",\n" +
                "\t\t\"wholesale buyer\",\n" +
                "\t\t\"wildlife biologist\",\n" +
                "\t\t\"window trimmer\",\n" +
                "\t\t\"wood patternmaker\",\n" +
                "\t\t\"woodworker\",\n" +
                "\t\t\"word processor\",\n" +
                "\t\t\"writer\",\n" +
                "\t\t\"yardmaster\",\n" +
                "\t\t\"zoologist\"\n" +
                "\t]\n" +
                "}";
        try {

            JSONObject jsonObject=new JSONObject(json);
            JSONArray jsonArray=jsonObject.getJSONArray("occupations");
            String[] aray = new String[jsonArray.length()];
            int i=0;
            while (i<jsonArray.length()){
                aray[i]=jsonArray.getString(i);
                i++;
            }
            return aray;
        } catch (JSONException e) {
            return null;

        }
    }
    public static String[] setindustry(){
        String json="{\n" +
                "  \"description\": \"A list of all industries on LinkedIn, as of May 21, 2013\",\n" +
                "  \"source\": \"http://robertwdempsey.com/liindustries\",\n" +
                "  \"industries\":\n" +
                "  [\n" +
                "    \"Accounting\",\n" +
                "    \"Airlines/Aviation\",\n" +
                "    \"Alternative Dispute Resolution\",\n" +
                "    \"Alternative Medicine\",\n" +
                "    \"Animation\",\n" +
                "    \"Apparel & Fashion\",\n" +
                "    \"Architecture & Planning\",\n" +
                "    \"Arts & Crafts\",\n" +
                "    \"Automotive\",\n" +
                "    \"Aviation & Aerospace\",\n" +
                "    \"Banking\",\n" +
                "    \"Biotechnology\",\n" +
                "    \"Broadcast Media\",\n" +
                "    \"Building Materials\",\n" +
                "    \"Business Supplies & Equipment\",\n" +
                "    \"Capital Markets\",\n" +
                "    \"Chemicals\",\n" +
                "    \"Civic & Social Organization\",\n" +
                "    \"Civil Engineering\",\n" +
                "    \"Commercial Real Estate\",\n" +
                "    \"Computer & Network Security\",\n" +
                "    \"Computer Games\",\n" +
                "    \"Computer Hardware\",\n" +
                "    \"Computer Networking\",\n" +
                "    \"Computer Software\",\n" +
                "    \"Construction\",\n" +
                "    \"Consumer Electronics\",\n" +
                "    \"Consumer Goods\",\n" +
                "    \"Consumer Services\",\n" +
                "    \"Cosmetics\",\n" +
                "    \"Dairy\",\n" +
                "    \"Defense & Space\",\n" +
                "    \"Design\",\n" +
                "    \"Education Management\",\n" +
                "    \"E-learning\",\n" +
                "    \"Electrical & Electronic Manufacturing\",\n" +
                "    \"Entertainment\",\n" +
                "    \"Environmental Services\",\n" +
                "    \"Events Services\",\n" +
                "    \"Executive Office\",\n" +
                "    \"Facilities Services\",\n" +
                "    \"Farming\",\n" +
                "    \"Financial Services\",\n" +
                "    \"Fine Art\",\n" +
                "    \"Fishery\",\n" +
                "    \"Food & Beverages\",\n" +
                "    \"Food Production\",\n" +
                "    \"Fundraising\",\n" +
                "    \"Furniture\",\n" +
                "    \"Gambling & Casinos\",\n" +
                "    \"Glass, Ceramics & Concrete\",\n" +
                "    \"Government Administration\",\n" +
                "    \"Government Relations\",\n" +
                "    \"Graphic Design\",\n" +
                "    \"Health, Wellness & Fitness\",\n" +
                "    \"Higher Education\",\n" +
                "    \"Hospital & Health Care\",\n" +
                "    \"Hospitality\",\n" +
                "    \"Human Resources\",\n" +
                "    \"Import & Export\",\n" +
                "    \"Individual & Family Services\",\n" +
                "    \"Industrial Automation\",\n" +
                "    \"Information Services\",\n" +
                "    \"Information Technology & Services\",\n" +
                "    \"Insurance\",\n" +
                "    \"International Affairs\",\n" +
                "    \"International Trade & Development\",\n" +
                "    \"Internet\",\n" +
                "    \"Investment Banking/Venture\",\n" +
                "    \"Investment Management\",\n" +
                "    \"Judiciary\",\n" +
                "    \"Law Enforcement\",\n" +
                "    \"Law Practice\",\n" +
                "    \"Legal Services\",\n" +
                "    \"Legislative Office\",\n" +
                "    \"Leisure & Travel\",\n" +
                "    \"Libraries\",\n" +
                "    \"Logistics & Supply Chain\",\n" +
                "    \"Luxury Goods & Jewelry\",\n" +
                "    \"Machinery\",\n" +
                "    \"Management Consulting\",\n" +
                "    \"Maritime\",\n" +
                "    \"Marketing & Advertising\",\n" +
                "    \"Market Research\",\n" +
                "    \"Mechanical or Industrial Engineering\",\n" +
                "    \"Media Production\",\n" +
                "    \"Medical Device\",\n" +
                "    \"Medical Practice\",\n" +
                "    \"Mental Health Care\",\n" +
                "    \"Military\",\n" +
                "    \"Mining & Metals\",\n" +
                "    \"Motion Pictures & Film\",\n" +
                "    \"Museums & Institutions\",\n" +
                "    \"Music\",\n" +
                "    \"Nanotechnology\",\n" +
                "    \"Newspapers\",\n" +
                "    \"Nonprofit Organization Management\",\n" +
                "    \"Oil & Energy\",\n" +
                "    \"Online Publishing\",\n" +
                "    \"Outsourcing/Offshoring\",\n" +
                "    \"Package/Freight Delivery\",\n" +
                "    \"Packaging & Containers\",\n" +
                "    \"Paper & Forest Products\",\n" +
                "    \"Performing Arts\",\n" +
                "    \"Pharmaceuticals\",\n" +
                "    \"Philanthropy\",\n" +
                "    \"Photography\",\n" +
                "    \"Plastics\",\n" +
                "    \"Political Organization\",\n" +
                "    \"Primary/Secondary\",\n" +
                "    \"Printing\",\n" +
                "    \"Professional Training\",\n" +
                "    \"Program Development\",\n" +
                "    \"Public Policy\",\n" +
                "    \"Public Relations\",\n" +
                "    \"Public Safety\",\n" +
                "    \"Publishing\",\n" +
                "    \"Railroad Manufacture\",\n" +
                "    \"Ranching\",\n" +
                "    \"Real Estate\",\n" +
                "    \"Recreational\",\n" +
                "    \"Facilities & Services\",\n" +
                "    \"Religious Institutions\",\n" +
                "    \"Renewables & Environment\",\n" +
                "    \"Research\",\n" +
                "    \"Restaurants\",\n" +
                "    \"Retail\",\n" +
                "    \"Security & Investigations\",\n" +
                "    \"Semiconductors\",\n" +
                "    \"Shipbuilding\",\n" +
                "    \"Sporting Goods\",\n" +
                "    \"Sports\",\n" +
                "    \"Staffing & Recruiting\",\n" +
                "    \"Supermarkets\",\n" +
                "    \"Telecommunications\",\n" +
                "    \"Textiles\",\n" +
                "    \"Think Tanks\",\n" +
                "    \"Tobacco\",\n" +
                "    \"Translation & Localization\",\n" +
                "    \"Transportation/Trucking/Railroad\",\n" +
                "    \"Utilities\",\n" +
                "    \"Venture Capital\",\n" +
                "    \"Veterinary\",\n" +
                "    \"Warehousing\",\n" +
                "    \"Wholesale\",\n" +
                "    \"Wine & Spirits\",\n" +
                "    \"Wireless\",\n" +
                "    \"Writing & Editing\"\n" +
                "  ]\n" +
                "}";
        try {

            JSONObject jsonObject=new JSONObject(json);
            JSONArray jsonArray=jsonObject.getJSONArray("industries");
            String[] aray = new String[jsonArray.length()];
            int i=0;
            while (i<jsonArray.length()){
                aray[i]=jsonArray.getString(i);
                i++;
            }
            return aray;
        } catch (JSONException e) {
            return null;

        }
    }
}
