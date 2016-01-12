package TechRegistNo;
import java.util.HashMap;

public class RcmsCode {
	
	 public static HashMap code() {
		HashMap rcmsCode = new HashMap();
		rcmsCode.put("0000","정상 처리되었습니다");
		rcmsCode.put("0001","전문 FORMAT ERROR");
		rcmsCode.put("0002","전문구분 오류");
		rcmsCode.put("0003","LINE 장애");
		rcmsCode.put("0004","LINE 장애");
		rcmsCode.put("0005","LINE 장애");
		rcmsCode.put("0006","기관코드 오류");
		rcmsCode.put("0007","은행코드 오류");
		rcmsCode.put("0009","미처리");
		rcmsCode.put("0010","필수 입력값 누락");
		rcmsCode.put("0100","해당전문번호 없음");
		rcmsCode.put("0199","SYSTEM ERROR");
		rcmsCode.put("0011","등록되지 않은 협약정보입니다");
		rcmsCode.put("0012","등록되지 않은 협약기관 정보입니다");
		rcmsCode.put("0013","이미 해지된 협약정보입니다");
		rcmsCode.put("0014","이미 해지된 협약기관정보입니다");
		rcmsCode.put("0101","전문번호 중복");
		rcmsCode.put("0102","즉시이체업무 개시 전");
		rcmsCode.put("0103","즉시이체업무 마감 후");
		rcmsCode.put("0104","입금 계좌점 마감");
		rcmsCode.put("0105","출금 계좌점 마감");
		rcmsCode.put("0111","이체일자 오류");
		rcmsCode.put("0112","이체금액 오류");
		rcmsCode.put("0113","복기부호 상이");
		rcmsCode.put("0114","비실명 계좌");
		rcmsCode.put("0115","CMS계좌");
		rcmsCode.put("0116","주민/사업자번호 상이");
		rcmsCode.put("0117","계좌오류 또는 해지계좌임");
		rcmsCode.put("0118","비밀번호 오류");
		rcmsCode.put("0119","비밀번호 3회 이상 입력오류");
		rcmsCode.put("0120","대월한도 초과");
		rcmsCode.put("0121","입금계좌 미등록");
		rcmsCode.put("0122","입금계좌 오류");
		rcmsCode.put("0123","입금계좌 입금한도 초과");
		rcmsCode.put("0124","입금계좌 거래제한");
		rcmsCode.put("0125","계좌번호 오류");
		rcmsCode.put("0126","계좌상태 오류");
		rcmsCode.put("0127","통장정리후 거래(미기장 포함)");
		rcmsCode.put("0128","실명 미등록 계좌");
		rcmsCode.put("0131","출금계좌 미등록");
		rcmsCode.put("0132","출금계좌 오류");
		rcmsCode.put("0133","출금계좌 잔액부족");
		rcmsCode.put("0134","출금계좌 거래제한");
		rcmsCode.put("0135","출금계좌 비밀번호 상이");
		rcmsCode.put("0136","인쇄내역(적요) 특수문자");
		rcmsCode.put("0150","잔액증명 발급계좌");
		rcmsCode.put("0151","사고신고 계좌");
		rcmsCode.put("0152","마감 전,후 거래 및 취소 불가");
		rcmsCode.put("0141","타행환 개시전");
		rcmsCode.put("0142","타행환 미실시 은행");
		rcmsCode.put("0143","타행은행코드 오류");
		rcmsCode.put("0144","타행거래 폭주");
		rcmsCode.put("0145","상대은행 장애");
		rcmsCode.put("0146","결제원 장애");
		rcmsCode.put("0147","타행환 종료");
		rcmsCode.put("0201","협약한도금액 = 정부출연금액 + 지자체부담현금금액 + 민간부담현금금액이 맞지 않습니다");
		rcmsCode.put("0202","이미 등록된 협약정보입니다");
		rcmsCode.put("0203","이미 등록된 협약기관 정보입니다");
		rcmsCode.put("0204","해당 협약정보의 사업비 계좌정보가 RCMS용 계좌가 아닙니다");
		rcmsCode.put("0205","해당 협약기관의 연구비 계좌정보가 RCMS용 계좌가 아닙니다");
		rcmsCode.put("0206","해당 협약기관의 협약한도금액이 초과되었습니다");
		rcmsCode.put("0207","해당 사업비 계좌거래명세 내역이 없습니다");
		rcmsCode.put("0208","해당 계좌정보가 RCMS용 계좌가 아닙니다");
		rcmsCode.put("0209","잘못된 구분 코드입니다");
		rcmsCode.put("0210","잘못된 금액 입력오류입니다");
		rcmsCode.put("0211","미래일자 입력오류입니다");
		rcmsCode.put("0212","변경정보가 기존정보와 동일합니다");
		rcmsCode.put("2044","해지계좌임");
		rcmsCode.put("2006","계좌번호 오류");
		rcmsCode.put("3000","주민/사업자 번호 오류");
		rcmsCode.put("IV01","전문일련번호 중복입니다");
		rcmsCode.put("IV02","기관원장에 없거나 해지된 기관입니다");
		rcmsCode.put("IV03","은행원장에 없거나 장애발생 은행입니다");
		rcmsCode.put("IV04","등록되지않은 전문입니다");
		rcmsCode.put("IV05","기타오류");
		rcmsCode.put("IV06","시스템장애");
		rcmsCode.put("IV07","카드사등록완료이나 카드정보파일 수신전입니다");
		rcmsCode.put("9979","내부 서버오류");
		rcmsCode.put("9980","내부 통신오류");
		rcmsCode.put("9981","JSONData값이 미입력 되었습니다");
		rcmsCode.put("9985","SECR_KEY 미입력");
		rcmsCode.put("9986","REQ_DATA값이 미입력 되었습니다");
		rcmsCode.put("9987","KEY값이 미입력 되었습니다");
		rcmsCode.put("9988","KEY값이 올바르지 않습니다");
		rcmsCode.put("9989","허용된 아이피가 아닙니다");
		rcmsCode.put("9990","잘못된 제휴기관코드입니다");
		rcmsCode.put("9993","해당기관은 서비스 되지 않은 기관입니다");
		rcmsCode.put("9994","조회계좌은행코드 미입력 오류");
		rcmsCode.put("9995","조회계좌은행코드 길이 오류(3자리)");
		rcmsCode.put("9998","JSON 파싱오류");
		rcmsCode.put("9999","내부 통신오류");
		rcmsCode.put("GWS09993","서비스 설정 값이 잘못되었습니다");

		rcmsCode.put("LC9999","계좌 검증 가능한 은행이 아닙니다.");
		return rcmsCode;
		
		}
	 	public static HashMap bankcode() {
		HashMap bankCd = new HashMap();
		
		// csdb의 cm_comm_dtl 의 gcomm_cd = 'C01' 은행목록
		bankCd.put("C01001","001"); //msg:"한국은행
		bankCd.put("C01002","002"); //msg:"한국산업은행
		bankCd.put("C01003","003"); //msg:"기업은행
		bankCd.put("C01004","004"); //msg:"국민은행
		bankCd.put("C01005","005"); //msg:"한국외환은행
		bankCd.put("C01007","007"); //msg:"수산업협동조합
		bankCd.put("C01008","008"); //msg:"한국수출입은행
		bankCd.put("C01011","011"); //msg:"농협 중앙회
		bankCd.put("C01020","020"); //msg:"우리은행
		bankCd.put("C01023","023"); //msg:"제일은행
		bankCd.put("C01027","027"); //msg:"한국씨티은행 (한미은행)
		bankCd.put("C01031","031"); //msg:"대구은행
		bankCd.put("C01032","032"); //msg:"부산은행
		bankCd.put("C01034","034"); //msg:"광주은행
		bankCd.put("C01037","037"); //msg:"전북은행
		bankCd.put("C01039","039"); //msg:"경남은행
		bankCd.put("C01050","050"); //msg:"상호저축은행
		bankCd.put("C01057","052"); //msg:"모건스탠리은행
		bankCd.put("C01054","054"); //msg:"홍콩상하이은행(HSBC)
		bankCd.put("C01055","055"); //msg:"도이치은행
		bankCd.put("C01059","059"); //msg:"미쓰비시도쿄은행
		bankCd.put("C01064","064"); //msg:"산림조합 중앙회
		bankCd.put("C01081","081"); //msg:"하나은행
		bankCd.put("C01088","088"); //msg:"신한은행
		bankCd.put("C01088","088"); //msg:"신한은행
		bankCd.put("C01071","071"); //msg:"우체국
		/* 
		 // pmsdb의 cm_comm_dtl 의 gcomm_cd = 'C01' 은행목록
		bankCd.put("C01006","001"); //msg:"한국은행
		bankCd.put("C01035","002"); //msg:"산업은행
		bankCd.put("C01004","003"); //msg:"기업은행
		bankCd.put("C01001","004"); //msg:"국민은행
		bankCd.put("C01007","005"); //msg:"외환은행
		bankCd.put("C01024","007"); //msg:"수협중앙회
		bankCd.put("C01057","008"); //msg:"수출입은행
		bankCd.put("C01011","011"); //msg:"농협중앙회
		bankCd.put("C01008","020"); //msg:"우리은행
		bankCd.put("C01013","023"); //msg:"SC제일은행
		bankCd.put("C01037","027"); //msg:"한국씨티은행
		bankCd.put("C01022","031"); //msg:"대구은행
		bankCd.put("C01023","032"); //msg:"부산은행
		bankCd.put("C01017","034"); //msg:"광주은행
		bankCd.put("C01010","035"); //msg:"제주은행
		bankCd.put("C01034","037"); //msg:"전북은행
		bankCd.put("C01021","039"); //msg:"경남은행
		bankCd.put("C01006","048"); //msg:"신협중앙회
		bankCd.put("C01044","050"); //msg:"상호저축은행
		bankCd.put("C01045","052"); //msg:"모건스탠리은행
		bankCd.put("C01046","054"); //msg:"HSBC은행
		bankCd.put("C01047","055"); //msg:"도이치은행
		bankCd.put("C01049","057"); //msg:"제이피모간체이스은행
		bankCd.put("C01050","058"); //msg:"미즈호코퍼레이트은행
		bankCd.put("C01051","059"); //msg:"미쓰비시도쿄UFJ은행
		bankCd.put("C01053","064"); //msg:"산림조합중앙회
		bankCd.put("C01054","076"); //msg:"신용보증기금
		bankCd.put("C01055","077"); //msg:"기술보증기금
		bankCd.put("C01030","081"); //msg:"하나은행
		bankCd.put("C01015","088"); //msg:"신한은행
		bankCd.put("C01056","099"); //msg:"금융결제원
	 	*/
	 
		return bankCd;
	 	}
	 }
