package com.wyw.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xuan
 * TestController redis
 * 测试实现批量查询redis中的数据，实现能够查询数据后返回值 作者：谢基炫
 * 使用到了spring-data-redis
 */
@RestController
@RequestMapping
public class TestController {

    @Autowired
    private StringRedisTemplate restTemplate;

    @GetMapping
    public String hello() {
        String[] ss = new String[]{
                "9011D6L00070",
                "9011D6L00181",
                "9011D6L00196",
                "9011D6L00205",
                "9011D6L00213",
                "9011D6L00238",
                "9011D6L00065",
                "9011D6L00129",
                "9011D6L00175",
                "9011D6L00261",
                "9011D6L00277",
                "9011D6L00288",
                "9011D6L00297",
                "9011D6L00384",
                "9011D6L00387",
                "9011D6L00397",
                "9011D6L00596",
                "9011D6L00202",
                "9011D6L00204",
                "9011D6L00218",
                "9011D6L00220",
                "9011D6L00276",
                "9011D6L00358",
                "9011D6L00359",
                "9011D6L00370",
                "9011D6L00374",
                "9011D6L00376",
                "9011D6L00392",
                "9011D6L00393",
                "9011D6L00399",
                "9011D6L00400",
                "9011D6L00413",
                "9011D6L00428",
                "9011D6L00444",
                "9011D6L00447",
                "9011D6L00489",
                "9011D6L00497",
                "9011D6L00508",
                "9011D6L00540",
                "9011D6L00621",
                "9011D6L00637",
                "9011D6L00215",
                "9011D6L00264",
                "9011D6L00271",
                "9011D6L00293",
                "9011D6L00294",
                "9011D6L00316",
                "9011D6L00362",
                "9011D6L00373",
                "9011D6L00382",
                "9011D6L00385",
                "9011D6L00398",
                "9011D6L00410",
                "9011D6L00427",
                "9011D6L00454",
                "9011D6L00462",
                "9011D6L00475",
                "9011D6L00483",
                "9011D6L00498",
                "9011D6L00503",
                "9011D6L00531",
                "9011D6L00549",
                "9011D6L00568",
                "9011D6L00595",
                "9011D6L00601",
                "9011D6L00603",
                "9011D6L00611",
                "9011D6L00623",
                "9011D6L00629",
                "9011D6L00643",
                "9011D6L00646",
                "9011D6L00654",
                "9011D6L00655",
                "9011D6L00658",
                "9011D6L00659",
                "9011D6L00518",
                "9011D6L00006",
                "9011D6L00015",
                "9011D6L00018",
                "9011D6L00026",
                "9011D6L00042",
                "9011D6L00057",
                "9011D6L00063",
                "9011D6L00064",
                "9011D6L00080",
                "9011D6L00079",
                "9011D6L00091",
                "9011D6L00097",
                "9011D6L00099",
                "9011D6L00115",
                "9011D6L00135",
                "9011D6L00155",
                "9011D6L00163",
                "9011D6L00173",
                "9011D6L00192",
                "9011D6L00195",
                "9011D6L00221",
                "9011D6L00240",
                "9011D6L00259",
                "9011D6L00273",
                "9011D6L00278",
                "9011D6L00287",
                "9011D6L00295",
                "9011D6L00345",
                "9011D6L00368",
                "9011D6L00381",
                "9011D6L00445",
                "9011D6L00468",
                "9011D6L00471",
                "9011D6L00473",
                "9011D6L00474",
                "9011D6L00479",
                "9011D6L00484",
                "9011D6L00485",
                "9011D6L00486",
                "9011D6L00487",
                "9011D6L00488",
                "9011D6L00495",
                "9011D6L00496",
                "9011D6L00499",
                "9011D6L00506",
                "9011D6L00512",
                "9011D6L00513",
                "9011D6L00517",
                "9011D6L00519",
                "9011D6L00521",
                "9011D6L00522",
                "9011D6L00526",
                "9011D6L00388",
                "9011D6L00395",
                "9011D6L00402",
                "9011D6L00453",
                "9011D6L00470",
                "9011D6L00514",
                "9011D6L00533",
                "9011D6L00560",
                "9011D6L00661",
                "9011D6L00671",
                "9011D6L00016",
                "9011D6L00122",
                "9011D6L00171",
                "9011D6L00142",
                "9011D6L00203",
                "9011D6L00208",
                "9011D6L00210",
                "9011D6L00212",
                "9011D6L00214",
                "9011D6L00217",
                "9011D6L00219",
                "9011D6L00003",
                "9011D6L00268",
                "9011D6L00269",
                "9011D6L00004",
                "9011D6L00272",
                "9011D6L00012",
                "9011D6L00285",
                "9011D6L00291",
                "9011D6L00027",
                "9011D6L00029",
                "9011D6L00030",
                "9011D6L00300",
                "9011D6L00031",
                "9011D6L00304",
                "9011D6L00032",
                "9011D6L00305",
                "9011D6L00034",
                "9011D6L00307",
                "9011D6L00039",
                "9011D6L00312",
                "9011D6L00040",
                "9011D6L00313",
                "9011D6L00041",
                "9011D6L00314",
                "9011D6L00044",
                "9011D6L00047",
                "9011D6L00054",
                "9011D6L00317",
                "9011D6L00061",
                "9011D6L00338",
                "9011D6L00062",
                "9011D6L00339",
                "9011D6L00068",
                "9011D6L00344",
                "9011D6L00069",
                "9011D6L00346",
                "9011D6L00073",
                "9011D6L00350",
                "9011D6L00075",
                "9011D6L00354",
                "9011D6L00077",
                "9011D6L00356",
                "9011D6L00357",
                "9011D6L00363",
                "9011D6L00377",
                "9011D6L00378",
                "9011D6L00380",
                "9011D6L00386",
                "9011D6L00391",
                "9011D6L00403",
                "9011D6L00404",
                "9011D6L00406",
                "9011D6L00408",
                "9011D6L00411",
                "9011D6L00412",
                "9011D6L00414",
                "9011D6L00416",
                "9011D6L00418",
                "9011D6L00421",
                "9011D6L00423",
                "9011D6L00429",
                "9011D6L00436",
                "9011D6L00439",
                "9011D6L00440",
                "9011D6L00441",
                "9011D6L00442",
                "9011D6L00443",
                "9011D6L00451",
                "9011D6L00455",
                "9011D6L00459",
                "9011D6L00415",
                "9011D6L00461",
                "9011D6L00082",
                "9011D6L00083",
                "9011D6L00084",
                "9011D6L00085",
                "9011D6L00088",
                "9011D6L00089",
                "9011D6L00090",
                "9011D6L00092",
                "9011D6L00096",
                "9011D6L00098",
                "9011D6L00101",
                "9011D6L00104",
                "9011D6L00105",
                "9011D6L00107",
                "9011D6L00108",
                "9011D6L00109",
                "9011D6L00111",
                "9011D6L00113",
                "9011D6L00116",
                "9011D6L00118",
                "9011D6L00120",
                "9011D6L00123",
                "9011D6L00125",
                "9011D6L00127",
                "9011D6L00131",
                "9011D6L00132",
                "9011D6L00136",
                "9011D6L00143",
                "9011D6L00144",
                "9011D6L00148",
                "9011D6L00151",
                "9011D6L00154",
                "9011D6L00157",
                "9011D6L00158",
                "9011D6L00159",
                "9011D6L00165",
                "9011D6L00167",
                "9011D6L00168",
                "9011D6L00174",
                "9011D6L00177",
                "9011D6L00180",
                "9011D6L00183",
                "9011D6L00437",
                "9011D6L00184",
                "9011D6L00185",
                "9011D6L00194",
                "9011D6L00197",
                "9011D6L00198",
                "9011D6L00199",
                "9011D6L00200",
                "9011D6L00201",
                "9011D6L00207",
                "9011D6L00209",
                "9011D6L00211",
                "9011D6L00250",
                "9011D6L00253",
                "9011D6L00257",
                "9011D6L00275",
                "9011D6L00303",
                "9011D6L00315",
                "9011D6L00372",
                "9011D6L00532",
                "9011D6L00534",
                "9011D6L00535",
                "9011D6L00536",
                "9011D6L00538",
                "9011D6L00539",
                "9011D6L00542",
                "9011D6L00546",
                "9011D6L00547",
                "9011D6L00550",
                "9011D6L00551",
                "9011D6L00552",
                "9011D6L00553",
                "9011D6L00554",
                "9011D6L00559",
                "9011D6L00562",
                "9011D6L00565",
                "9011D6L00567",
                "9011D6L00588",
                "9011D6L00589",
                "9011D6L00592",
                "9011D6L00598",
                "9011D6L00599",
                "9011D6L00608",
                "9011D6L00614",
                "9011D6L00616",
                "9011D6L00617",
                "9011D6L00618",
                "9011D6L00620",
                "9011D6L00622",
                "9011D6L00624",
                "9011D6L00625",
                "9011D6L00634",
                "9011D6L00635",
                "9011D6L00636",
                "9011D6L00640",
                "9011D6L00641",
                "9011D6L00642",
                "9011D6L00649",
                "9011D6L00653",
                "9011D6L00657",
                "9011D6L00662",
                "9011D6L00663",
                "9011D6L00664",
                "9011D6L00669",
                "9011D6L00670",
                "9011D6L00672",
                "9011D6L00674",
                "9011D6L00677",
                "9011D6L00679",
                "9011D6L00689",
                "9011D6L00692",
                "9011D6L00695",
                "9011D6L00696",
                "9011D6L00698",
                "9011D6L00711",
                "9011D6L00716",
                "9011D6L00699",
                "9011D6L00700",
                "9011D6L00703",
                "9011D6L00707",
                "9011D6L00709",
                "9011D6L00718",
                "9011D6L00720",
                "9011D6L00725",
                "9011D6L00726",
                "9011D6L00727",
                "9011D6L00728",
                "9011D6L00729",
                "9011D6L00731",
                "9011D6L00477",
                "9011D6L00500",
                "9011D6L00545",
                "9011D6L00570",
                "9011D6L00590",
                "9011D6L00606",
                "9011D6L00628",
                "9011D6L00014",
                "9011D6L00052",
                "9011D6L00071",
                "9011D6L00076",
                "9011D6L00078",
                "9011D6L00093",
                "9011D6L00095",
                "9011D6L00117",
                "9011D6L00153",
                "9011D6L00170",
                "9011D6L00216",
                "9011D6L00255",
                "9011D6L00282",
                "9011D6L00290",
                "9011D6L00347",
                "9011D6L00371",
                "9011D6L00375",
                "9011D6L00379",
                "9011D6L00389",
                "9011D6L00390",
                "9011D6L00469",
                "9011D6L00481",
                "9011D6L00525",
                "9011D6L00528",
                "9011D6L00597",
                "9011D6L00631",
                "9011D6L00343",
                "9011D6L00351",
                "9011D6L00352",
                "9011D6L00360",
                "9011D6L00361",
                "9011D6L00405",
                "9011D6L00419",
                "9011D6L00424",
                "9011D6L00426",
                "9011D6L00434",
                "9011D6L00446",
                "9011D6L00452",
                "9011D6L00458",
                "9011D6L00466",
                "9011D6L00467",
                "9011D6L00478",
                "9011D6L00492",
                "9011D6L00493",
                "9011D6L00507",
                "9011D6L00556",
                "9011D6L00593",
                "9011D6L00609",
                "9011D6L00610",
                "9011D6L00615",
                "9011D6L00633",
                "9011D6L00639",
                "9011D6L00651",
                "9011D6L00656",
                "9011D6L00660",
                "9011D6L00665",
                "9011D6L00705",
                "9011D6L00710",
                "9011D6L00723",
                "9011D6L00258",
                "9011D6L00299",
                "9011D6L00340",
                "9011D6L00341",
                "9011D6L00349",
                "9011D6L00353",
                "9011D6L00355",
                "9011D6L00407",
                "9011D6L00417",
                "9011D6L00482",
                "9011D6L00607",
                "9011D6L00675",
                "9011D6L00676",
                "9011D6L00687",
                "9011D6L00690",
                "9011D6L00694",
                "9011D6L00704",
                "9011D6L00721",
                "9011D6L00348",
                "9011D6L00409",
                "9011D6L00432",
                "9011D6L00433",
                "9011D6L00448",
                "9011D6L00464",
                "9011D6L00472",
                "9011D6L00502",
                "9011D6L00505",
                "9011D6L00561",
                "9011D6L00564",
                "9011D6L00572",
                "9011D6L00619",
                "9011D6L00647",
                "9011D6L00667",
                "9011D6L00680",
                "9011D6L00691",
                "9011D6L00715",
                "9011D6L00401",
                "9011D6L00460",
                "9011D6L00465",
                "9011D6L00490",
                "9011D6L00494",
                "9011D6L00544",
                "9011D6L00548",
                "9011D6L00571",
                "9011D6L00600",
                "9011D6L00604",
                "9011D6L00644",
                "9011D6L00650",
                "9011D6L00686",
                "9011D6L00701",
                "9011D6L00435",
                "9011D6L00456",
                "9011D6L00509",
                "9011D6L00515",
                "9011D6L00520",
                "9011D6L00563",
                "9011D6L00602",
                "9011D6L00648",
                "9011D6L00666",
                "9011D6L00668",
                "9011D6L00678",
                "9011D6L00683",
                "9011D6L00693",
                "9011D6L00712",
                "9011D6L00730",
                "9011D6L00537",
                "9011D6L00566",
                "9011D6L00717",
                "9011D6L00007",
                "9011D6L00028",
                "9011D6L00033",
                "9011D6L00036",
                "9011D6L00043",
                "9011D6L00045",
                "9011D6L00048",
                "9011D6L00055",
                "9011D6L00056",
                "9011D6L00058",
                "9011D6L00059",
                "9011D6L00060",
                "9011D6L00066",
                "9011D6L00067",
                "9011D6L00072",
                "9011D6L00074",
                "9011D6L00086",
                "9011D6L00087",
                "9011D6L00100",
                "9011D6L00103",
                "9011D6L00110",
                "9011D6L00112",
                "9011D6L00114",
                "9011D6L00119",
                "9011D6L00121",
                "9011D6L00133",
                "9011D6L00149",
                "9011D6L00150",
                "9011D6L00152",
                "9011D6L00156",
                "9011D6L00160",
                "9011D6L00161",
                "9011D6L00162",
                "9011D6L00164",
                "9011D6L00169",
                "9011D6L00172",
                "9011D6L00176",
                "9011D6L00178",
                "9011D6L00179",
                "9011D6L00189",
                "9011D6L00191",
                "9011D6L00193",
                "9011D6L00206",
                "9011D6L00262",
                "9011D6L00263",
                "9011D6L00279",
                "9011D6L00281",
                "9011D6L00284",
                "9011D6L00286",
                "9011D6L00289",
                "9011D6L00364",
                "9011D6L00365",
                "9011D6L00366",
                "9011D6L00053",
                "9011D6L00081",
                "9011D6L00367",
                "9011D6L00369",
                "9011D6L00383",
                "9011D6L00394",
                "9011D6L00396",
                "9011D6L00420",
                "9011D6L00430",
                "9011D6L00463",
                "9011D6L00530",
                "9011D6L00569",
                "9011D6L00613",
                "9011D6L00682",
                "9011D6LX0012",
                "9011D6L00311",
                "9011D6L00265",
                "9011D6L00301",
                "9011D6L00342",
                "9011D6L00449",
                "9011D6L00450",
                "9011D6L00457",
                "9011D6L00491",
                "9011D6L00516",
                "9011D6L00543",
                "9011D6L00558",
                "9011D6L00594",
                "9011D6L00605",
                "9011D6L00626",
                "9011D6L00630",
                "9011D6L00638",
                "9011D6L00645",
                "9011D6L00652",
                "9011D6L00685",
                "9011D6L00697",
                "9011D6L00713",
                "9011D6L00722",
                "9011D6L00555",
                "9011D6L00529",
                "9011D6L00504",
                "9011D6L00541",
                "9011D6L00612",
                "9011D6L00438",
                "9011D6L00627",
                "9011D6L00302",
                "9011D6L00308",
                "9011D6L00632",
                "9011D6L00557",
                "9011D6L00591",
                "9011D6L00310",
                "9011D6L00524",
                "9011D6LX0005",
                "9011D6LX0007",
                "9011D6LX0008",
                "9011D6LX0011",
                "9011D6KX0133",
                "9011D6L00239",
                "9011D6L00252",
                "9011D6L00527",
                "9011D6L00738",
                "9011D6L00748",
                "9011D6L00764",
                "9011D6L00767",
                "9011D6L00778",
                "9011D6L00779",
                "9011D6L00759",
                "9011D6L00249",
                "9011D6L00425",
                "9011D6L00248",
                "9011D6L00243",
                "9011D6L00254",
                "9011D6L00251",
                "9011D6LX0003",
                "9011D6L00763",
                "9011D6LX0004",
                "9011D6L00737",
                "9011D6L00510",
                "9011D6LX0014",
                "9011D6L00774",
                "9011D6L00771",
                "9011D6L00245",
                "9011D6L00431",
                "9011D6L00769",
                "9011D6L00511",
                "9011D6L00781",
                "9011D6L00742",
                "9011D6L00750",
                "9011D6L00772",
                "9011D6LX0017",
                "9011D6L00422",
                "9011D6L00777",
                "9011D6L00745",
                "9011D6L00296",
                "9011D6LX0013",
                "9011D6L00480",
                "9011D6L00523",
                "9011D6L00733",
                "9011D6L00780",
                "9011D6L00256",
                "9011D6L00775",
                "9011D6L00782",
                "9011D6LX0015",
                "9011D6L00770",
                "9011D6LX0006",
                "9011D6L00244",
                "9011D6L00754",
                "9011D6L00757",
                "9011D6L00768",
                "9011D6L00766",
                "9011D6L00773",
                "9011D6L00247",
                "9011D6L00776",
                "9011D6L00765",
                "9011D6L00739",
                "9011D6L00246",
                "9011D6L00241",
                "9011D6L00005",
                "9011D6L00187",
                "9011D6L00124",
                "9011D6L00190",
                "9011D6L00102",
                "9011D6L00140",
                "9011D6L00126",
                "9011D6L00139",
                "9011D6L00147",
                "9011D6L00145",
                "9011D6L00106",
                "9011D6L00002",
                "9011D6L00022",
                "9011D6L00146",
                "9011D6L00274",
                "9011D6L00242",
                "9011D6L00050",
                "9011D6L00024",
                "9011D6L00267",
                "9011D6L00166",
                "9011D6L00128",
                "9011D6L00046",
                "9011D6L00141",
                "9011D6L00137",
                "9011D6L00134",
                "9011D6L00130",
                "9011D6L00298",
                "9011D6L00266",
                "9011D6L00138",
                "9011D6L00025",
                "9011D6L00010",
                "9011D6L00011",
                "9011D6L00019",
                "9011D6L00009",
                "9011D6L00051",
                "9011D6L00017",
                "9011D6L00013",
                "9011D6L00023",
                "9011D6L00020",
                "9011D6L00049",
                "9011D6L00021",
                "9011D6L00038",
                "9011D6L00037",
                "9011D6L00035",
                "9011D6L00008",
                "9011D6L00094",
                "9011D6L00182",
                "9011D6L00186",
                "9011D6L00188",
                "9011D6LX0002",
                "9011D6LX0018"
        };
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        for (String s : ss) {
            Object o = restTemplate.opsForHash().get("OTA:VEHICLE_MESSAGE",s);
            if (o != null) {
                System.out.print(s);
                String r = (String) o;
                System.out.print("  :   ");
                Long t = Long.parseLong(r.substring(r.length() - 14,r.length() - 1));

                System.out.print(sdf.format(new Date(t)));
                System.out.print("\n");
            }
        }

        return "hello";
    }
}
