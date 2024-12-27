package dancijiyibuchongfu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class dancijiyibuchongfu {
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		System.out.println("请选择单词测试模式（输入）：1.中文-英语，2.英语-中文。");
		int b=reader.nextInt();
		System.out.println("请选择要测试的单词所学习的日期（输入）:1.第一天(specate),2.第二天(visa),3.第三天(audio),4.第四天(dictionary),5.第五天(claim),6.第六天(core),7.第七天(band),8.第八天(comprise)");
		double a=reader.nextDouble();
		if(b==2){
		if(a==1){
		List<String>list=new ArrayList<String>();
		list.add("spectate");
		list.add("spectrum");
		list.add("optics");
		list.add("optician");
		list.add("optic");
		list.add("optical");
		list.add("scope");
		list.add("sceptic/skeptic");
		list.add("spy");
		list.add("despise");
		list.add("suspicious");
		list.add("conspicuous");
		list.add("suspect");
		list.add("perspective");
		list.add("prospect");
		list.add("inspector");
		list.add("inspect");
		list.add("retrospect");
		list.add("respective");
		list.add("respectful");
		list.add("respectable");
		list.add("respect");
		list.add("expectation");
		list.add("expect");
		list.add("aspect");
		list.add("species");
		list.add("specific");
		list.add("specimen");
		list.add("speculate");
		list.add("spectator");
		list.add("spectacle");
		list.add("spectacular");
		List<String>listRandom=new ArrayList<String>();
		for(int i1=1;i1<=31;i1++){
			Random random=new Random();
			Math.random();
			int j=random.nextInt(list.size()-1);
			listRandom.add(list.get(j));
			list.remove(j);
		}
		for(String I:listRandom){
			System.out.println(I);
			String meaning=reader.next();
		}
		}
		if(a==2){
			List<String>list=new ArrayList<String>();
			list.add("visitor");
			list.add("visit");
			list.add("invisible");
			list.add("interview");
			list.add("review  ");
			list.add("viewpoint ");
			list.add("view ");
			list.add("provision ");
			list.add("provided");
			list.add("provide ");
			list.add("supervise");
			list.add("revise  ");
			list.add("envious");
			list.add("envy ");
			list.add("envision");
			list.add("envisage ");
			list.add("evidence  ");
			list.add("evident ");
			list.add("devise ");
			list.add("device ");
			list.add("advisable ");
			list.add("advice ");
			list.add("advise ");
			list.add("visual ");
			list.add("visible ");
			list.add("vision");
			list.add("visa ");
			List<String>listRandom=new ArrayList<String>();
			for(int i2=1;i2<=26;i2++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==3){
			List<String>list=new ArrayList<String>();
			list.add("conspiracy ");
			list.add("conspire  ");
			list.add("aspiration");
			list.add("aspirant ");
			list.add("aspire    ");
			list.add("spiritual   ");
			list.add("incentive   ");
			list.add("spirit   ");
			list.add("accent  ");
			list.add("erosion   ");
			list.add("erode  ");
			list.add("corrode    ");
			list.add("rodent  ");
			list.add("rotten   ");
			list.add("rat  ");
			list.add("auditorium ");
			list.add("auditory    ");
			list.add("auditor  ");
			list.add("audit ");
			list.add("audience  ");
			list.add("audible ");
			list.add("audio ");
			list.add("desperate   ");
			list.add("despair ");
			list.add("respiration   ");
			list.add("respire");
			list.add("perspiration  ");
			list.add("perspire   ");
			list.add("inspiration   ");
			list.add("inspire  ");
			list.add("expire    ");
			List<String>listRandom=new ArrayList<String>();
			for(int i3=1;i3<=30;i3++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==4){
			List<String>list=new ArrayList<String>();
			list.add("dialog  ");
			list.add("slogan  ");
			list.add("eloquent ");
			list.add("log   ");
			list.add("manifest      ");
			list.add("confess    ");
			list.add("professional    ");
			list.add("profession    ");
			list.add("profess   ");
			list.add("fame   ");
			list.add("fable  ");
			list.add("index     ");
			list.add("indicative    ");
			list.add("indication     ");
			list.add("indicate   ");
			list.add("verdict   ");
			list.add("dedicate     ");
			list.add("predict    ");
			list.add("contradiction  ");
			list.add("contradict   ");
			list.add("addict  ");
			list.add("indict   ");
			list.add("dictionary     ");
			list.add("psychology  ");
			list.add("biology    ");
			list.add("geology ");
			list.add("apologize   ");
			list.add("apology    ");
			list.add("monologue    ");
			list.add("catalog    ");
			list.add("analogy    ");
			list.add("analog    ");
			list.add("logic    ");
			List<String>listRandom=new ArrayList<String>();
			for(int i4=1;i4<=32;i4++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==5){
			List<String>list=new ArrayList<String>();
			list.add("capsule    ");
			list.add("captain    ");
			list.add("decapitate  ");
			list.add("capitalism   ");
			list.add("chapter      ");
			list.add("capital      ");
			list.add("cape    ");
			list.add("cap     ");
			list.add("vowel    ");
			list.add("devote    ");
			list.add("veto   ");
			list.add("vote     ");
			list.add("evoke      ");
			list.add("provoke      ");
			list.add("advocate    ");
			list.add("vocal     ");
			list.add("vocation     ");
			list.add("vocabulary     ");
			list.add("proclamation    ");
			list.add("exclamation    ");
			list.add("proclaim   ");
			list.add("exclaim    ");
			list.add("acclaim       ");
			list.add("reclaim    ");
			list.add("claim      ");
			list.add("headmaster  ");
			list.add("headquarters    ");
			list.add("headline     ");
			list.add("head      ");
			list.add("cabbage    ");
			list.add("cabinet    ");
			list.add("cabin      ");
			list.add("cab    ");
			List<String>listRandom=new ArrayList<String>();
			for(int i5=1;i5<=32;i5++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==6){
			List<String>list=new ArrayList<String>();
			list.add("manage    ");
			list.add("man     ");
			list.add("ministry   ");
			list.add("minister   ");
			list.add("occupation        ");
			list.add("occupy       ");
			list.add("cop ");
			list.add("cope       ");
			list.add("capture    ");
			list.add("captivate     ");
			list.add("captive    ");
			list.add("capacity      ");
			list.add("capable        ");
			list.add("courtyard        ");
			list.add("courteous     ");
			list.add("court       ");
			list.add("courage     ");
			list.add("discord     ");
			list.add("record      ");
			list.add("accord    ");
			list.add("corner     ");
			list.add("cordial      ");
			list.add("cord         ");
			list.add("core      ");
			list.add("commence         ");
			list.add("adminisiration    ");
			list.add("commander     ");
			list.add("command       ");
			list.add("manual      ");
			list.add("manipulate      ");
			list.add("maneuver     ");
			list.add("manager       ");
			list.add("management      ");
			list.add("administer     ");
			List<String>listRandom=new ArrayList<String>();
			for(int i6=1;i6<=33;i6++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==7){
			List<String>list=new ArrayList<String>();
			list.add("fence      ");
			list.add("rebel      ");
			list.add("beat     ");
			list.add("debate    ");
			list.add("combat          ");
			list.add("battery         ");
			list.add("battle  ");
			list.add("acrobat  ");
			list.add("bat ");
			list.add("rally  ");
			list.add("ally  ");
			list.add("liable ");
			list.add("colleague  ");
			list.add("league  ");
			list.add("obligation ");
			list.add("oblige ");
			list.add("religious ");
			list.add("religion ");
			list.add("abound  ");
			list.add("boundary  ");
			list.add("rebound  ");
			list.add("bound ");
			list.add("bond ");
			list.add("bind ");
			list.add("band ");
			list.add("defensive  ");
			list.add("defense ");
			list.add("defendant  ");
			list.add("defend  ");
			list.add("offensive  ");
			list.add("offense /offence");
			list.add("fend  ");
			list.add("fencing  ");
			list.add("offend  ");
			List<String>listRandom=new ArrayList<String>();
			for(int i7=1;i7<=33;i7++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==8){
			List<String>list=new ArrayList<String>();
			list.add("content  ");
			list.add("tenant  ");
			list.add("detention ");
			list.add("discontent ");
			list.add("contented ");
			list.add("sustain  ");
			list.add("retain  ");
			list.add("obtain  ");
			list.add("maintain");
			list.add("entertainment ");
			list.add("detain ");
			list.add("container");
			list.add("contain ");
			list.add("attainment");
			list.add("attain");
			list.add("prey ");
			list.add("comprehensive ");
			list.add("comprehension ");
			list.add("comprehend ");
			list.add("surprise  ");
			list.add("prize");
			list.add("prisoner  ");
			list.add("entrepreneur  ");
			list.add("enterprise  ");
			list.add("comprise ");
			list.add("continual   ");
			list.add("continuity   ");
			list.add("continuous   ");
			list.add("continent    ");
			list.add("retention   ");
			list.add("maintenance  ");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i8=1;i8<=31;i8++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==9){
			List<String>list=new ArrayList<String>();
			list.add("inciseve ");
			list.add("precise ");
			list.add("concise ");
			list.add("decay ");
			list.add("occasion ");
			list.add("casual ");
			list.add("case ");
			list.add("patricide ");
			list.add("pesticide ");
			list.add("suicide ");
			list.add("decide ");
			list.add("coincide ");
			list.add("incident ");
			list.add("accident ");
			list.add("forecast ");
			list.add("broadcast ");
			list.add("discharge  ");
			list.add("charge");
			list.add("carrier ");
			list.add("carriage  ");
			list.add("carpenter  ");
			list.add("cargo ");
			list.add("career ");
			list.add("cart ");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i9=1;i9<=24;i9++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==10){
			List<String>list=new ArrayList<String>();
			list.add("include ");
			list.add("exclusive  ");
			list.add("exclusion  ");
			list.add("exclude  ");
			list.add("conclusion  ");
			list.add("conclude  ");
			list.add("enclosure ");
			list.add("enclose  ");
			list.add("disclose  ");
			list.add("closet ");
			list.add("individual  ");
			list.add("dividend  ");
			list.add("divide  ");
			list.add("discriminate  ");
			list.add("discrepancy  ");
			list.add("discreet  ");
			list.add("discern ");
			list.add("concern ");
			list.add("tailor  ");
			list.add("retail  ");
			list.add("intersection ");
			list.add("segment  ");
			list.add("insect  ");
			list.add("sector  ");
			list.add("section ");
			list.add("clause     ");
			list.add("preclude    ");
			list.add("inclusive    ");
			list.add("recover      ");
			list.add("discover     ");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i10=1;i10<=30;i10++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==11){
			List<String>list=new ArrayList<String>();
			list.add("strap  ");
			list.add("strangle");
			list.add("strive  ");
			list.add("stretch  ");
			list.add("stress ");
			list.add("constrict ");
			list.add("restrict");
			list.add("district");
			list.add("distress  ");
			list.add("strict ");
			list.add("string  ");
			list.add("straightforward ");
			list.add("constraint  ");
			list.add("constrain  ");
			list.add("restraint ");
			list.add("restrain  ");
			list.add("strain  ");
			list.add("drip  ");
			list.add("drill  ");
			list.add("drift  ");
			list.add("drain  ");
			list.add("draft  ");
			list.add("withdraw  ");
			list.add("strenuous    ");
			list.add("stern     ");
			list.add("strategic ");
			list.add("strategy ");
			list.add("straight ");
			list.add("drag  ");
			list.add("drawback  ");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i11=1;i11<=29;i11++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==12){
			List<String>list=new ArrayList<String>();
			list.add("interrupt ");
			list.add("erupt  ");
			list.add("disrupt   ");
			list.add("corrupt  ");
			list.add("bankruptcy");
			list.add("abruption ");
			list.add("abrupt  ");
			list.add("retreat ");
			list.add("retrieve  ");
			list.add("portray  ");
			list.add("tramp ");
			list.add("trait ");
			list.add("train");
			list.add("trail  ");
			list.add("track  ");
			list.add("trace ");
			list.add("subtract ");
			list.add("extract");
			list.add("distract  ");
			list.add("attract  ");
			list.add("abstract ");
			list.add("traction  ");
			list.add("tractor ");
			list.add("tract ");
			list.add("frustrate  ");
			list.add("fracture  ");
			list.add("friction  ");
			list.add("fraction");
			list.add("fragile");
			list.add("ruin ");
			list.add("contract   ");
			list.add("fragment  ");
			List<String>listRandom=new ArrayList<String>();
			for(int i12=1;i12<=31;i12++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==13){
			List<String>list=new ArrayList<String>();
			list.add("laundry   ");
			list.add("launch  ");
			list.add("lavish    ");
			list.add("lave    ");
			list.add("subscription  ");
			list.add("subscribe ");
			list.add("prescription   ");
			list.add("prescribe    ");
			list.add("description ");
			list.add("describe   ");
			list.add("manuscript ");
			list.add("script ");
			list.add("telegram");
			list.add("diagram");
			list.add("programme    ");
			list.add("telegraph    ");
			list.add("photography ");
			list.add("photographic    ");
			list.add("photograph   ");
			list.add("graphic ");
			list.add("graph   ");
			list.add("bibliography   ");
			list.add("autobiography");
			list.add("biography ");
			list.add("absolution    ");
			list.add("absolute   ");
			list.add("dissolve    ");
			list.add("resolution ");
			list.add("resolve   ");
			list.add("solution   ");
			list.add("soluble    ");
			list.add("solve      ");
			list.add("dilute  ");
			list.add("geography ");
			List<String>listRandom=new ArrayList<String>();
			for(int i13=1;i13<=33;i13++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==14){
			List<String>list=new ArrayList<String>();
			list.add("proposition");
			list.add("propose  ");
			list.add("preposition ");
			list.add("impose   ");
			list.add("exposure     ");
			list.add("expose ");
			list.add("disposition ");
			list.add("disposal ");
			list.add("dispose   ");
			list.add("composite ");
			list.add("compose  ");
			list.add("subject ");
			list.add("reject  ");
			list.add("project    ");
			list.add("object    ");
			list.add("inject    ");
			list.add("impact  ");
			list.add("compact   ");
			list.add("relieve     ");
			list.add("relief  ");
			list.add("alleviate    ");
			list.add("elevator   ");
			list.add("elevate ");
			list.add("lever  ");
			list.add("synthesis    ");
			list.add("synthetic   ");
			list.add("hypothesis    ");
			list.add("theme     ");
			list.add("thesis    ");
			list.add("symposium  ");
			list.add("suppose");
			list.add("purpose  ");
			list.add("eject  ");
			List<String>listRandom=new ArrayList<String>();
			for(int i14=1;i14<=32;i14++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==15){
			List<String>list=new ArrayList<String>();
			list.add("ambition    ");
			list.add("segregate  ");
			list.add("congregate  ");
			list.add("ingredient    ");
			list.add("upgrade  ");
			list.add("undergraduate    ");
			list.add("graduate    ");
			list.add("gradual");
			list.add("grade   ");
			list.add("progressive");
			list.add("progress    ");
			list.add("aggressive   ");
			list.add("succession    ");
			list.add("succeed      ");
			list.add("proceeding     ");
			list.add("exceed    ");
			list.add("recede    ");
			list.add("precedent     ");
			list.add("precede     ");
			list.add("concession    ");
			list.add("concede    ");
			list.add("procession    ");
			list.add("process  ");
			list.add("access    ");
			list.add("invade    ");
			list.add("evade     ");
			list.add("perish    ");
			list.add("transition     ");
			list.add("transient        ");
			list.add("initiative      ");
			list.add("initial ");
			list.add("initiate    ");
			list.add("excess   ");
			list.add("proceed    ");
			list.add("eject  ");
			List<String>listRandom=new ArrayList<String>();
			for(int i15=1;i15<=34;i15++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==15.5){
			List<String>list=new ArrayList<String>();
			list.add("press");
			list.add("compress");
			list.add("decompress");
			list.add("compressibility");
			list.add("compressible");
			list.add("compressor");
			list.add("compression");
			list.add("depress");
			list.add("depressed");
			list.add("depressing");
			list.add("depressive");
			list.add("depression");
			list.add("express");
			list.add("expression");
			list.add("expressionless");
			list.add("expressive");
			list.add("impress");
			list.add("impressive");
			list.add("impression");
			list.add("impressionable");
			list.add("impressment");
			list.add("oppress");
			list.add("oppressed");
			list.add("oppressive");
			list.add("oppressor");
			list.add("oppression");
			list.add("suppress");
			list.add("suppressant");
			list.add("suppression");
			list.add("suppressor");
			list.add("suppresser");
			list.add("sting");
			list.add("distinct");
			list.add("distinction");
			list.add("distinctive");
			list.add("distinctiveness");
			list.add("distinctly");
			list.add("extinct");
			list.add("extinction");
			list.add("instinct");
			list.add("instinctive");
			list.add("extinguish");
			list.add("extinguisher");
			list.add("extinguishable");
			list.add("stimulate");
			list.add("stimulation");
			list.add("stimulant");
			list.add("stimulus");
			list.add("contact");
			list.add("intact");
			list.add("context");
			list.add("contextual");
			list.add("contextualize");
			list.add("contextualization");
			list.add("pretext");
			list.add("texture");
			list.add("textural");
			list.add("torch");
			list.add("torment");
			list.add("tormentor");
			list.add("torture");
			list.add("torturous");
			list.add("torturer");
			list.add("distort");
			list.add("distorted");
			list.add("distortion");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i15=1;i15<=66;i15++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==16){
			List<String>list=new ArrayList<String>();
			list.add("movement    ");
			list.add("remove    ");
			list.add("removal ");
			list.add("movie    ");
			list.add("move    ");
			list.add("migrate  ");
			list.add("migrant ");
			list.add("immigrant   ");
			list.add("emigrate   ");
			list.add("elaps   ");
			list.add("lapse    ");
			list.add("collapse    ");
			list.add("suffer ");
			list.add("offer  ");
			list.add("indifferent");
			list.add("differentiate ");
			list.add("differ ");
			list.add("transfer ");
			list.add("reference   ");
			list.add("refer ");
			list.add("inference    ");
			list.add("infer     ");
			list.add("conference ");
			list.add("confer ");
			list.add("ferry ");
			list.add("remote    ");
			list.add("promote     ");
			list.add("motor      ");
			list.add("motive      ");
			list.add("motivate ");
			list.add("emotion      ");
			list.add("motion    ");
			list.add("mobilize    ");
			list.add("mobile     ");
			list.add("mob      ");
			list.add("momentum    ");
			List<String>listRandom=new ArrayList<String>();
			for(int i16=1;i16<=35;i16++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==17){
			List<String>list=new ArrayList<String>();
			list.add("missile");
			list.add("missing");
			list.add("mission");
			list.add("missionary");
			list.add("admission");
			list.add("commission");
			list.add("dismiss");
			list.add("dismissal");
			list.add("commit");
			list.add("commitment");
			list.add("committee");
			list.add("emit");
			list.add("emission");
			list.add("intermit");
			list.add("intermittent");
			list.add("intermission");
			list.add("omit");
			list.add("omission");
			list.add("permit");
			list.add("permission");
			list.add("premise");
			list.add("promise");
			list.add("promising");
			list.add("submit");
			list.add("transmit");
			list.add("transmission");
			list.add("message");
			list.add("messenger");
			list.add("consult");
			list.add("result");
			list.add("insult");
			list.add("assault");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i17=1;i17<=32;i17++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==18){
			List<String>list=new ArrayList<String>();
			list.add("ascend");
			list.add("ascent");
			list.add("escalate");
			list.add("upscale");
			list.add("downscale");
			list.add("descend");
			list.add("descent");
			list.add("descendant");
			list.add("transcend");
			list.add("preside");
			list.add("reside");
			list.add("obsess");
			list.add("possess");
			list.add("possession");
			list.add("session");
			list.add("execute");
			list.add("persecute");
			list.add("prosecute");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i18=1;i18<=18;i18++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==18.5){
			List<String>list=new ArrayList<String>();
			list.add("pass");
			list.add("stand");
			list.add("stay");
			list.add("insist");
			list.add("assist");
			list.add("consist");
			list.add("consistent");
			list.add("exist");
			list.add("persist");
			list.add("resist");
			list.add("destination");
			list.add("destiny");
			list.add("constituent");
			list.add("constitution");
			list.add("institute");
			list.add("substitute");
			list.add("superstition");
			list.add("stage");
			list.add("stable");
			list.add("stagnant");
			list.add("stagger");
			list.add("stance");
			list.add("standard");
			list.add("standpoint");
			list.add("startle");
			list.add("state");
			list.add("static");
			list.add("station");
			list.add("stationary");
			list.add("stationery");
			list.add("statistic");
			list.add("statue");
			list.add("status");
			list.add("statute");
			list.add("substance");
			list.add("stall");
			list.add("install");
			list.add("stale");
			list.add("stare");
			list.add("stiff");
			list.add("stun");
			list.add("sturdy");
			list.add("stock");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i18=1;i18<=43;i18++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==19){
			List<String>list=new ArrayList<String>();
			list.add("count");
			list.add("account");
			list.add("discount");
			list.add("number");
			list.add("enumerate");
			list.add("cognitive");
			list.add("diagnose");
			list.add("ignore");
			list.add("recognize");
			list.add("science");
			list.add("conscience");
			list.add("conscious");
			list.add("comment");
			list.add("mental");
			list.add("mind");
			list.add("memorial");
			list.add("monitor");
			list.add("monument");
			list.add("prove");
			list.add("approve");
			list.add("probe");
			list.add("improve");
			list.add("probable");
			list.add("problem");
			list.add("compute");
			list.add("deputy");
			list.add("dispute");
			list.add("reputation");
			list.add("disrepute");
			list.add("cure");
			list.add("secure");
			list.add("orthodox");
			list.add("paradox");
			list.add("emphasize");
			list.add("fancy");
			list.add("fantasy");
			list.add("phase");
			list.add("phenomenon");
			list.add("philosophy");
			list.add("sophisticate");
			list.add("sophomore");
			list.add("alter");
			list.add("alternate");
			list.add("alien");
			list.add("apt");
			list.add("adapt");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i19=1;i19<=45;i19++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==20){
			List<String>list=new ArrayList<String>();
			list.add("clarigy");
			list.add("declare");
			list.add("equal");
			list.add("equation");
			list.add("equivalent");
			list.add("adequate");
			list.add("firm");
			list.add("affirm");
			list.add("confirm");
			list.add("force");
			list.add("enforce");
			list.add("reinforce");
			list.add("fort");
			list.add("comfort");
			list.add("effort");
			list.add("afford");
			list.add("fortune");
			list.add("fortitude");
			list.add("value");
			list.add("evaluate");
			list.add("avail");
			list.add("prevail");
			list.add("valid");
			list.add("invalid");
			list.add("aggravate");
			list.add("grave");
			list.add("gravity");
			list.add("gray");
			list.add("grief");
			list.add("grieve");
			list.add("liberate");
			list.add("liberal");
			list.add("liberty");
			list.add("deliberate");
			list.add("magnify");
			list.add("magnitude");
			list.add("majesty");
			list.add("major");
			list.add("maximum");
			list.add("diminish");
			list.add("miniatrue");
			list.add("minimum");
			list.add("minor");
			list.add("minus");
			list.add("minute");
			list.add("novel");
			list.add("novice");
			list.add("innovation");
			list.add("renovate");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i20=1;i20<=48;i20++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==21){
			List<String>list=new ArrayList<String>();
			list.add("prior");
			list.add("prime");
			list.add("premier");
			list.add("primary");
			list.add("primeval");
			list.add("primitive");
			list.add("principle");
			list.add("principal");
			list.add("private");
			list.add("deprive");
			list.add("proper");
			list.add("property");
			list.add("appropriate");
			list.add("expropriate");
			list.add("correct");
			list.add("erect");
			list.add("rectify");
			list.add("direct");
			list.add("directory");
			list.add("sacred");
			list.add("sacrifice");
			list.add("sanction");
			list.add("saint");
			list.add("satisfy");
			list.add("saturate");
			list.add("similar");
			list.add("assimilate");
			list.add("simulate");
			list.add("assemble");
			list.add("resemble");
			list.add("vacation");
			list.add("vacant");
			list.add("vacuum");
			list.add("vain");
			list.add("van");
			list.add("vanish");
			list.add("void");
			list.add("evacuate");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i21=1;i21<=38;i21++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==22){
			List<String>list=new ArrayList<String>();
			list.add("amateur");
			list.add("amiable");
			list.add("amorous");
			list.add("credential");
			list.add("credit");
			list.add("certain");
			list.add("ascertain");
			list.add("certifiacte");
			list.add("faith");
			list.add("confide");
			list.add("confident");
			list.add("federal");
			list.add("admire");
			list.add("marvelous");
			list.add("miracle");
			list.add("mirror");
			list.add("negative");
			list.add("neither");
			list.add("neutral");
			list.add("negotiate");
			list.add("sense");
			list.add("sensible");
			list.add("sensitive");
			list.add("sensation");
			list.add("sentence");
			list.add("sentiment");
			list.add("scene");
			list.add("scenery");
			list.add("scent");
			list.add("consent");
			list.add("consensus");
			list.add("resent");
			list.add("assent");
			list.add("absence");
			list.add("present");
			list.add("represent");
			list.add("passion");
			list.add("passive");
			list.add("compassion");
			list.add("patient");
			list.add("compatible");
			list.add("apathy");
			list.add("pathetic");
			list.add("sympathy");
			list.add("telepathy");
			list.add("antipathy");
			list.add("despair");
			list.add("prosper");
			list.add("timid");
			list.add("intimidate");
			list.add("assure");
			list.add("ensure");
			list.add("insure");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i22=1;i22<=52;i22++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==37){
			List<String>list=new ArrayList<String>();
			list.add("isle");
			list.add("island");
			list.add("insulate");
			list.add("isolate");
			list.add("illuminate");
			list.add("illumination");
			list.add("illuminated");
			list.add("illusion");
			list.add("illusory");
			list.add("illustrate");
			list.add("illustrative");
			list.add("illustrator");
			list.add("marine");
			list.add("submarine");
			list.add("microphone");
			list.add("phone");
			list.add("telephone");
			list.add("symphony");
			list.add("phonetics");
			list.add("phonics");
			list.add("prophet");
			list.add("prophecy");
			list.add("radar");
			list.add("radiate");
			list.add("radical");
			list.add("radio");
			list.add("radius");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i37=1;i37<=27;i37++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==38){
			List<String>list=new ArrayList<String>();
			list.add("solut");
			list.add("salvation");
			list.add("solitary");
			list.add("sole");
			list.add("solo");
			list.add("solar");
			list.add("solemn");
			list.add("solidarity");
			list.add("solid");
			list.add("console");
			list.add("consolidate");
			list.add("desolate");
			list.add("candle");
			list.add("candid");
			list.add("candidate");
			list.add("candy");
			list.add("circle");
			list.add("circuit");
			list.add("circular");
			list.add("circulation");
			list.add("circumstance");
			list.add("circus");
			list.add("cycle");
			list.add("bicycle");
			list.add("tricycle");
			list.add("encyclopedia");
			list.add("recycle");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i38=1;i38<=27;i38++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==39){
			List<String>list=new ArrayList<String>();
			list.add("crucial");
			list.add("cruise");
			list.add("sphere");
			list.add("atmosphere");
			list.add("center");
			list.add("concentrate");
			list.add("angle");
			list.add("ankle");
			list.add("anchor");
			list.add("interface");
			list.add("preface");
			list.add("surface");
			list.add("superficial");
			list.add("confront");
			list.add("confrontation");
			list.add("frontier");
			list.add("local");
			list.add("locality");
			list.add("locate");
			list.add("location");
			list.add("allocate");
			list.add("locomote");
			list.add("locomotion");
			list.add("locomotive");
			list.add("collocate");
			list.add("collocation");
			list.add("locus");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i39=1;i39<=27;i39++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==40){
			List<String>list=new ArrayList<String>();
			list.add("immediate");
			list.add("intermediate");
			list.add("medal");
			list.add("mediate");
			list.add("medieval");
			list.add("medium");
			list.add("amid");
			list.add("midst");
			list.add("mild");
			list.add("moderate");
			list.add("modest");
			list.add("modify");
			list.add("mean");
			list.add("means");
			list.add("permeate");
			list.add("melt");
			list.add("approach");
			list.add("reproach");
			list.add("approximate");
			list.add("proximity");
			list.add("summit");
			list.add("sum");
			list.add("summarize");
			list.add("summary");
			list.add("summon");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i40=1;i40<=25;i40++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==41){
			List<String>list=new ArrayList<String>();
			list.add("arch");
			list.add("architecture");
			list.add("architect");
			list.add("monarch");
			list.add("monarchy");
			list.add("anarchy");
			list.add("patriarchy");
			list.add("hierarchy");
			list.add("regular");
			list.add("regime");
			list.add("region");
			list.add("register");
			list.add("regulate");
			list.add("regulation");
			list.add("reign");
			list.add("rein");
			list.add("sovereign");
			list.add("sovereignty");
			list.add("reinforce");
			list.add("rig");
			list.add("rigor");
			list.add("rigorous");
			list.add("realm");
			list.add("royal");
			list.add("royalty");
			list.add("educate");
			list.add("education");
			list.add("educational");
			list.add("deduce");
			list.add("deduct");
			list.add("deduction");
			list.add("induce");
			list.add("conduct");
			list.add("conductor");
			list.add("conductivity");
			list.add("conducive");
			list.add("misconduct");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i41=1;i41<=37;i41++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==42){
			List<String>list=new ArrayList<String>();
			list.add("pardon");
			list.add("donate");
			list.add("donation");
			list.add("donor");
			list.add("anecdote");
			list.add("endow");
			list.add("dose");
			list.add("gene");
			list.add("gender");
			list.add("general");
			list.add("generate");
			list.add("generation");
			list.add("generator");
			list.add("regenerate");
			list.add("degenerate");
			list.add("generous");
			list.add("genesis");
			list.add("genetic");
			list.add("genius");
			list.add("ingenious");
			list.add("ingenuity");
			list.add("pregnant");
			list.add("pregnancy");
			list.add("engine");
			list.add("engineer");
			list.add("engineering");
			list.add("kin");
			list.add("kind");
			list.add("habit");
			list.add("habitat");
			list.add("habitant");
			list.add("inhabit");
			list.add("inhabitant");
			list.add("exhibit");
			list.add("exhibition");
			list.add("inhibit");
			list.add("prohibit");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i42=1;i42<=37;i42++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==43){
			List<String>list=new ArrayList<String>();
			list.add("join");
			list.add("joint");
			list.add("adjoin");
			list.add("disjoin");
			list.add("conjoin");
			list.add("junction");
			list.add("adjunct");
			list.add("disjunct");
			list.add("adjunction");
			list.add("conjunction");
			list.add("junk");
			list.add("jungle");
			list.add("jumble");
			list.add("adjacent");
			list.add("collaborate");
			list.add("elaborate");
			list.add("labor");
			list.add("lecture");
			list.add("dialect");
			list.add("legend");
			list.add("allege");
			list.add("allegory");
			list.add("collect");
			list.add("recollect");
			list.add("elect");
			list.add("intellectual");
			list.add("neglect");
			list.add("intelligence");
			list.add("eligible");
			list.add("elite");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i43=1;i43<=30;i43++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==44){
			List<String>list=new ArrayList<String>();
			list.add("examine");
			list.add("exempt");
			list.add("sample");
			list.add("prompt");
			list.add("assume");
			list.add("consume");
			list.add("presume");
			list.add("command");
			list.add("demand");
			list.add("commend");
			list.add("recommend");
			list.add("comment");
			list.add("mental");
			list.add("mind");
			list.add("remind");
			list.add("medicine");
			list.add("remedy");
			list.add("centimeter");
			list.add("diameter");
			list.add("thermometer");
			list.add("geometry");
			list.add("metre");
			list.add("metric");
			list.add("immense");
			list.add("demension");
			list.add("measure");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i44=1;i44<=26;i44++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==45){
			List<String>list=new ArrayList<String>();
			list.add("merchandise");
			list.add("merchant");
			list.add("mercury");
			list.add("mercy");
			list.add("merit");
			list.add("notebook");
			list.add("note");
			list.add("notice");
			list.add("notify");
			list.add("notion");
			list.add("notorious");
			list.add("denote");
			list.add("announce");
			list.add("denounce");
			list.add("pronounce");
			list.add("pronunciation");
			list.add("apparatus");
			list.add("comparable");
			list.add("comparative");
			list.add("compare");
			list.add("comparison");
			list.add("pair");
			list.add("paradox");
			list.add("parallel");
			list.add("partner");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i45=1;i45<=24;i45++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==46){
			List<String>list=new ArrayList<String>();
			list.add("compel");
			list.add("expel");
			list.add("propel");
			list.add("repel");
			list.add("impel");
			list.add("compulsory");
			list.add("compulsive");
			list.add("impulse");
			list.add("pulse");
			list.add("repulse");
			list.add("repulsive");
			list.add("repulsion");
			list.add("appeal");
			list.add("repeal");
			list.add("pendulum");
			list.add("appendix");
			list.add("depend");
			list.add("dependent");
			list.add("independent");
			list.add("independence");
			list.add("expenditure");
			list.add("suspend");
			list.add("expense");
			list.add("expensive");
			list.add("compensate");
			list.add("indispensable");
			list.add("pension");
			list.add("ponder");
			list.add("appetite");
			list.add("compete");
			list.add("competent");
			list.add("competition");
			list.add("competitive");
			list.add("impetus");
			list.add("petition");
			list.add("perpetual");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i46=1;i46<=36;i46++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==47){
			List<String>list=new ArrayList<String>();
			list.add("apparent");
			list.add("parade");
			list.add("apparel");
			list.add("pry");
			list.add("complex");
			list.add("complicate");
			list.add("perplex");
			list.add("multiple");
			list.add("multiply");
			list.add("triple");
			list.add("duplicate");
			list.add("explicit");
			list.add("imply");
			list.add("implicit");
			list.add("implication");
			list.add("diploma");
			list.add("diplomatic");
			list.add("display");
			list.add("implement");
			list.add("apply");
			list.add("appliance");
			list.add("applicable");
			list.add("application");
			list.add("explore");
			list.add("exploit");
			list.add("plural");
			list.add("plus");
			list.add("pause");
			list.add("question");
			list.add("quest");
			list.add("request");
			list.add("acquire");
			list.add("require");
			list.add("enquire/inquire");
			list.add("enquiry/inquiry");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i47=1;i47<=35;i47++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==48){
			List<String>list=new ArrayList<String>();
			list.add("sequence");
			list.add("sequential");
			list.add("consequence");
			list.add("consequent");
			list.add("consequently");
			list.add("subsequence");
			list.add("subsequent");
			list.add("consecutive");
			list.add("sue");
			list.add("pursue");
			list.add("pursuit");
			list.add("ensue");
			list.add("conserve");
			list.add("conservation");
			list.add("conservative");
			list.add("preserve");
			list.add("persevere");
			list.add("reserve");
			list.add("reservation");
			list.add("reservoir");
			list.add("serve");
			list.add("servant");
			list.add("service");
			list.add("deserve");
			list.add("observe");
			list.add("observer");
			list.add("observation");
			list.add("observatory");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i48=1;i48<=28;i48++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==49){
			List<String>list=new ArrayList<String>();
			list.add("construct");
			list.add("construe");
			list.add("destruction");
			list.add("destructive");
			list.add("destroy");
			list.add("instruct");
			list.add("instruction");
			list.add("instructor");
			list.add("instrument");
			list.add("insturmental");
			list.add("attempt");
			list.add("tempt");
			list.add("temptation");
			list.add("contempt");
			list.add("temper");
			list.add("temperament");
			list.add("contribute");
			list.add("tribute");
			list.add("tributary");
			list.add("contribution");
			list.add("contributor");
			list.add("distribute");
			list.add("distribution");
			list.add("attribute");
			list.add("disturb");
			list.add("disturbance");
			list.add("turbine");
			list.add("turbulent");
			list.add("perturb");
			list.add("abuse");
			list.add("utilize");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i49=1;i49<=31;i49++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==50){
			List<String>list=new ArrayList<String>();
			list.add("convict");
			list.add("conviction");
			list.add("convince ");
			list.add("victim");
			list.add("revenge");
			list.add("dynamic");
			list.add("dynasty");
			list.add("found");
			list.add("foundation");
			list.add("fountain");
			list.add("fund");
			list.add("fundamental");
			list.add("judge");
			list.add("judgement");
			list.add("judicial");
			list.add("prejudice");
			list.add("legal");
			list.add("legislate");
			list.add("legitimate");
			list.add("privilege");
			list.add("allegiance");
			list.add("eliminate");
			list.add("preliminary");
			list.add("term");
			list.add("terminal");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i50=1;i50<=25;i50++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==51){
			List<String>list=new ArrayList<String>();
			list.add("literature");
			list.add("literal");
			list.add("literacy ");
			list.add("literally");
			list.add("literary");
			list.add("literate");
			list.add("illiterate");
			list.add("accommodate");
			list.add("accommodation");
			list.add("commodity");
			list.add("model");
			list.add("modify");
			list.add("common");
			list.add("commonplace");
			list.add("commonsense");
			list.add("community");
			list.add("communism");
			list.add("communicate");
			list.add("communication");
			list.add("telecommunication");
			list.add("immune");
			list.add("immunity");
			list.add("municipal");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i51=1;i51<=23;i51++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==52){
			List<String>list=new ArrayList<String>();
			list.add("name");
			list.add("namely");
			list.add("nominal ");
			list.add("nominate");
			list.add("anonymous");
			list.add("denominate");
			list.add("norm");
			list.add("normal");
			list.add("normalize");
			list.add("normalization");
			list.add("abnormal");
			list.add("enormous");
			list.add("anomalous");
			list.add("anomaly");
			list.add("coordinate");
			list.add("disorder");
			list.add("extraordinary");
			list.add("order");
			list.add("orderly");
			list.add("ordinary");
			list.add("subordinate");
			list.add("depart");
			list.add("impart");
			list.add("parcel");
			list.add("partial");
			list.add("particular");
			list.add("portion");
			list.add("proportion");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i52=1;i52<=27;i52++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==53){
			List<String>list=new ArrayList<String>();
			list.add("metropolitan");
			list.add("policy");
			list.add("polite ");
			list.add("political");
			list.add("politician");
			list.add("politics");
			list.add("poll");
			list.add("polity");
			list.add("appraisal");
			list.add("appreciate");
			list.add("sign");
			list.add("signal");
			list.add("signature");
			list.add("significance");
			list.add("significant");
			list.add("signify");
			list.add("assign");
			list.add("assignment");
			list.add("design");
			list.add("designate");
			list.add("resign");
			list.add("test");
			list.add("testify");
			list.add("testimony");
			list.add("contest");
			list.add("protest");
			list.add("attest");
			list.add("detest");
			list.add("protestant");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i53=1;i53<=29;i53++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==54){
			List<String>list=new ArrayList<String>();
			list.add("author");
			list.add("authorize");
			list.add("authority ");
			list.add("authentic");
			list.add("democracy");
			list.add("democratize");
			list.add("democratism");
			list.add("epidemic");
			list.add("demography");
			list.add("adhere");
			list.add("adhesive");
			list.add("cohere");
			list.add("coherence");
			list.add("coherent");
			list.add("cohesion");
			list.add("cohesive");
			list.add("inhere");
			list.add("inherent");
			list.add("heir");
			list.add("heiress");
			list.add("heirship");
			list.add("inherit");
			list.add("inheritance");
			list.add("inheritor");
			list.add("hereditray");
			list.add("heritage");
			list.add("hesitate");
			list.add("patriotic");
			list.add("patron");
			list.add("social");
			list.add("association");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i54=1;i54<=31;i54++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		if(a==55){
			List<String>list=new ArrayList<String>();
			list.add("bar");
			list.add("barrier");
			list.add("embarrass");
			list.add("barbecue");
			list.add("barn");
			list.add("barrel");
			list.add("dome");
			list.add("kingdom");
			list.add("domain");
			list.add("domestic");
			list.add("dominant");
			list.add("dominate");
			list.add("dominion");
			list.add("predominant");
			list.add("passport");
			list.add("port");
			list.add("import");
			list.add("export");
			list.add("deport");
			list.add("portal");
			list.add("portable");
			list.add("porter");
			list.add("portfolio");
			list.add("reportedly");
			list.add("transport");
			list.add("opportunity");
			list.add("via");
			list.add("deviate");
			list.add("trivial");
			list.add("triviality");
			list.add("convey");
			list.add("vehicle");
			list.add("previous");
			list.add("voyage");
			list.add("我是最后的");
			List<String>listRandom=new ArrayList<String>();
			for(int i55=1;i55<=34;i55++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
			}
		}
		if(b==1){
		if(a==1){
			List<String>list=new ArrayList<String>();
			list.add("v./出席/观看");
			list.add("n./生物/物种；种类 adj.物种上的");
			list.add("adj.特殊的；明确的；/药/具有特效的 n.特性；细节；特效药");
			list.add("n.样品；样本；标本");
			list.add("vi.(about,on)推测，推断 2.做投机买卖 vt.推断，，推测");
			list.add("n.观众，旁观者");
			list.add("n.1.(大规模)演出，场面 2.景象，壮观 3./pl./眼镜");
			list.add("a.壮观的，引人注目的 n.壮观的演出，惊人之举");
			list.add("n.1.谱，光谱，频谱 2.范围，幅度，系列");
			list.add("n.1.方面 2.(建筑物的)朝向，方向 3.面貌，外观");
			list.add("vt.1.预料，预计，可能发生 2.等待，期待，盼望 3.要求");
			list.add("n.期待，期望");
			list.add("n.1.期待，预期 2./pl./前程，成功的前景");
			list.add("vt.1.尊敬 n.1.尊敬 2.尊重，重视 3./pl./敬意，问候 4.涉及，方面");
			list.add("a.可敬的，有名望的，高尚的，值得尊敬的");
			list.add("a.恭敬的，尊敬的，尊重人的，有礼貌的");
			list.add("a.各自的，各个的，分别的");
			list.add("n/v.追溯，回顾");
			list.add("vt.检查，视察");
			list.add("n.检察员，巡视员");
			list.add("n.1.前景，前途 2.景象 3.可能成为主顾的人 vt.(for)勘探");
			list.add("n.1.视角 2.远景，景观 3.透视画法，透视图");
			list.add("vt.1.疑有，推测 2.对...表示怀疑 n.嫌疑犯，可疑分子");
			list.add("a.显眼的，明显的");
			list.add("a.1.猜疑的，疑心的 2.可疑的");
			list.add("vt.鄙视，看不起");
			list.add("n.间谍，特务 vi.1.当间谍 2.(on)暗中观察(或侦察) vt.看见，发现");
			list.add("n.怀疑论者 adj.怀疑性的");
			list.add("n.范围；余地；视野；眼界；导弹射程 vt.审视");
			list.add("a.1）光（学）的 2）眼的，视力的 3）视觉的");
			list.add("adj.眼的，视觉的，光学上的");
			list.add("n.1.眼睛商，验光师 2.眼睛商点 3.光学仪器制造者");
			list.add("n.光学");
			List<String>listRandom=new ArrayList<String>();
			for(int i=1;i<=31;i++){
				Random random=new Random();
				Math.random();
				int j=random.nextInt(list.size()-1);
				listRandom.add(list.get(j));
				list.remove(j);
			}
			for(String I:listRandom){
				System.out.println(I);
				String meaning=reader.next();
			}
		}
		}
	}
}