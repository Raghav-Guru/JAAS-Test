# JAAS-Test
Simple java class to check Login context using JAAS file. 

``` 
#git clone https://github.com/Raghav-Guru/JAAS-Test.git
#javac JaasTest.java ```
#java -Dsun.security.krb5.debug=true JaasTest <JaasFile> <ContextName>
```

### Sample Output :

```
# /usr/jdk64/jdk1.8.0_112/bin/java -Dsun.security.krb5.debug=true JaasTest  /etc/hadoop//conf/hdfs_nn_jaas.conf com.sun.security.jgss.krb5.initiate
>>> KeyTabInputStream, readName(): RAGHAV.COM
>>> KeyTabInputStream, readName(): nn
>>> KeyTabInputStream, readName(): c116-node6.coelab.cloudera.com
>>> KeyTab: load() entry length: 87; type: 16
>>> KeyTabInputStream, readName(): RAGHAV.COM
>>> KeyTabInputStream, readName(): nn
>>> KeyTabInputStream, readName(): c116-node6.coelab.cloudera.com
>>> KeyTab: load() entry length: 71; type: 3
>>> KeyTabInputStream, readName(): RAGHAV.COM
>>> KeyTabInputStream, readName(): nn
>>> KeyTabInputStream, readName(): c116-node6.coelab.cloudera.com
>>> KeyTab: load() entry length: 79; type: 17
>>> KeyTabInputStream, readName(): RAGHAV.COM
>>> KeyTabInputStream, readName(): nn
>>> KeyTabInputStream, readName(): c116-node6.coelab.cloudera.com
>>> KeyTab: load() entry length: 79; type: 23
>>> KeyTabInputStream, readName(): RAGHAV.COM
>>> KeyTabInputStream, readName(): nn
>>> KeyTabInputStream, readName(): c116-node6.coelab.cloudera.com
>>> KeyTab: load() entry length: 95; type: 18
Looking for keys for: nn/c116-node6.coelab.cloudera.com@RAGHAV.COM
Java config name: null
Native config name: /etc/krb5.conf
Loaded from native config
Added key: 18version: 2
Added key: 23version: 2
Added key: 17version: 2
Found unsupported keytype (3) for nn/c116-node6.coelab.cloudera.com@RAGHAV.COM
Added key: 16version: 2
>>> KdcAccessibility: reset
Looking for keys for: nn/c116-node6.coelab.cloudera.com@RAGHAV.COM
Added key: 18version: 2
Added key: 23version: 2
Added key: 17version: 2
Found unsupported keytype (3) for nn/c116-node6.coelab.cloudera.com@RAGHAV.COM
Added key: 16version: 2
Using builtin default etypes for default_tkt_enctypes
default etypes for default_tkt_enctypes: 18 17 16 23.
>>> KrbAsReq creating message
>>> KrbKdcReq send: kdc=172.26.88.231 UDP:88, timeout=30000, number of retries =3, #bytes=170
>>> KDCCommunication: kdc=172.26.88.231 UDP:88, timeout=30000,Attempt =1, #bytes=170
>>> KrbKdcReq send: #bytes read=306
>>>Pre-Authentication Data:
	 PA-DATA type = 136

>>>Pre-Authentication Data:
	 PA-DATA type = 19
	 PA-ETYPE-INFO2 etype = 18, salt = RAGHAV.COMnnc116-node6.coelab.cloudera.com, s2kparams = null

>>>Pre-Authentication Data:
	 PA-DATA type = 2
	 PA-ENC-TIMESTAMP
>>>Pre-Authentication Data:
	 PA-DATA type = 133

>>> KdcAccessibility: remove 172.26.88.231
>>> KDCRep: init() encoding tag is 126 req type is 11
>>>KRBError:
	 cTime is Tue Oct 19 13:05:28 UTC 2010 1287493528000
	 sTime is Thu Jan 23 20:02:57 UTC 2020 1579809777000
	 suSec is 199726
	 error code is 25
	 error Message is Additional pre-authentication required
	 cname is nn/c116-node6.coelab.cloudera.com@RAGHAV.COM
	 sname is krbtgt/RAGHAV.COM@RAGHAV.COM
	 eData provided.
	 msgType is 30
>>>Pre-Authentication Data:
	 PA-DATA type = 136

>>>Pre-Authentication Data:
	 PA-DATA type = 19
	 PA-ETYPE-INFO2 etype = 18, salt = RAGHAV.COMnnc116-node6.coelab.cloudera.com, s2kparams = null

>>>Pre-Authentication Data:
	 PA-DATA type = 2
	 PA-ENC-TIMESTAMP
>>>Pre-Authentication Data:
	 PA-DATA type = 133

KRBError received: NEEDED_PREAUTH
KrbAsReqBuilder: PREAUTH FAILED/REQ, re-send AS-REQ
Using builtin default etypes for default_tkt_enctypes
default etypes for default_tkt_enctypes: 18 17 16 23.
Looking for keys for: nn/c116-node6.coelab.cloudera.com@RAGHAV.COM
Added key: 18version: 2
Added key: 23version: 2
Added key: 17version: 2
Found unsupported keytype (3) for nn/c116-node6.coelab.cloudera.com@RAGHAV.COM
Added key: 16version: 2
Looking for keys for: nn/c116-node6.coelab.cloudera.com@RAGHAV.COM
Added key: 18version: 2
Added key: 23version: 2
Added key: 17version: 2
Found unsupported keytype (3) for nn/c116-node6.coelab.cloudera.com@RAGHAV.COM
Added key: 16version: 2
Using builtin default etypes for default_tkt_enctypes
default etypes for default_tkt_enctypes: 18 17 16 23.
>>> EType: sun.security.krb5.internal.crypto.Aes256CtsHmacSha1EType
>>> KrbAsReq creating message
>>> KrbKdcReq send: kdc=172.26.88.231 UDP:88, timeout=30000, number of retries =3, #bytes=257
>>> KDCCommunication: kdc=172.26.88.231 UDP:88, timeout=30000,Attempt =1, #bytes=257
>>> KrbKdcReq send: #bytes read=732
>>> KdcAccessibility: remove 172.26.88.231
Looking for keys for: nn/c116-node6.coelab.cloudera.com@RAGHAV.COM
Added key: 18version: 2
Added key: 23version: 2
Added key: 17version: 2
Found unsupported keytype (3) for nn/c116-node6.coelab.cloudera.com@RAGHAV.COM
Added key: 16version: 2
>>> EType: sun.security.krb5.internal.crypto.Aes256CtsHmacSha1EType
>>> KrbAsRep cons in KrbAsReq.getReply nn/c116-node6.coelab.cloudera.com
subject: Subject:
	Principal: nn/c116-node6.coelab.cloudera.com@RAGHAV.COM
	Private Credential: Ticket (hex) =
0000: 61 82 01 59 30 82 01 55   A0 03 02 01 05 A1 0C 1B  a..Y0..U........
0010: 0A 52 41 47 48 41 56 2E   43 4F 4D A2 1F 30 1D A0  .RAGHAV.COM..0..
0020: 03 02 01 02 A1 16 30 14   1B 06 6B 72 62 74 67 74  ......0...krbtgt
0030: 1B 0A 52 41 47 48 41 56   2E 43 4F 4D A3 82 01 1D  ..RAGHAV.COM....
0040: 30 82 01 19 A0 03 02 01   12 A1 03 02 01 01 A2 82  0...............
0050: 01 0B 04 82 01 07 B7 73   D5 EE F4 42 A5 14 31 8A  .......s...B..1.
0060: 0B 31 2A 63 07 DE 9A E3   81 58 B1 D9 25 4D A4 38  .1*c.....X..%M.8
0070: 7A 0D F8 2F 58 76 2E 80   7D 91 99 16 35 2C D1 DB  z../Xv......5,..
0080: 6D 45 10 8B 42 C5 EE 88   92 22 43 94 E7 9A 93 91  mE..B...."C.....
0090: D2 E8 89 DD 54 BB D6 BD   90 89 B2 B0 43 DD 43 36  ....T.......C.C6
00A0: C7 20 5F 49 8C 1B 8A B4   AE F8 CD 82 16 5D 6B EF  . _I.........]k.
00B0: D5 E0 4D FF 87 34 A0 78   FE 64 97 B6 DE D2 86 D6  ..M..4.x.d......
00C0: E7 18 34 8C D9 E1 BF C6   13 11 BE 29 A3 9A A3 34  ..4........)...4
00D0: 41 1F DE 52 A7 BD 72 A1   88 56 3F 70 95 CB 3B 5D  A..R..r..V?p..;]
00E0: 12 06 4E 6D 9B 22 4B 8F   FE 57 48 A0 0F 1E 7C 8C  ..Nm."K..WH.....
00F0: 25 3B 9E B6 46 78 E1 34   8B 5D 4C DA DB ED F9 4A  %;..Fx.4.]L....J
0100: 96 DA 08 5F 6B A8 D9 FE   06 75 D2 18 51 3F 1F 74  ..._k....u..Q?.t
0110: C0 D5 4A 39 BC 4B 02 D6   2E AE 3D 88 2D 87 01 5E  ..J9.K....=.-..^
0120: A8 CE 13 79 17 6C 85 48   32 20 20 D9 08 D3 14 7E  ...y.l.H2  .....
0130: E5 BF A9 7F 0E B6 14 9B   CC 33 B0 A5 2C AF 0E CF  .........3..,...
0140: 76 83 60 25 5B 8A 9C 60   89 61 12 03 C2 20 CF 4C  v.`%[..`.a... .L
0150: CE 72 FF 68 55 B8 2F 20   C8 12 07 68 34           .r.hU./ ...h4

Client Principal = nn/c116-node6.coelab.cloudera.com@RAGHAV.COM
Server Principal = krbtgt/RAGHAV.COM@RAGHAV.COM
Session Key = EncryptionKey: keyType=18 keyBytes (hex dump)=
0000: 12 98 ED DF F2 5A 44 02   47 8C 6B 75 71 08 2B 52  .....ZD.G.kuq.+R
0010: 6C 6D 1B 22 29 81 E5 34   B5 4C D5 AD A6 C3 BC 2B  lm.")..4.L.....+


Forwardable Ticket true
Forwarded Ticket false
Proxiable Ticket false
Proxy Ticket false
Postdated Ticket false
Renewable Ticket false
Initial Ticket false
Auth Time = Thu Jan 23 20:02:57 UTC 2020
Start Time = Thu Jan 23 20:02:57 UTC 2020
End Time = Fri Jan 24 20:02:57 UTC 2020
Renew Till = null
Client Addresses  Null
	Private Credential: /etc/security/keytabs/nn.service.keytab for nn/c116-node6.coelab.cloudera.com@RAGHAV.COM

  ```
