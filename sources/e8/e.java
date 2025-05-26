package e8;

import android.util.Base64;
import j9.q;
import java.util.UUID;
import kh2.a1;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class e extends d {

    /* renamed from: e, reason: collision with root package name */
    public boolean f57729e;

    /* renamed from: f, reason: collision with root package name */
    public UUID f57730f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f57731g;

    @Override // e8.d
    public final Object b() {
        UUID uuid = this.f57730f;
        byte[] q13 = a1.q(uuid, null, this.f57731g);
        byte[] bArr = this.f57731g;
        q[] qVarArr = new q[1];
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < bArr.length; i13 += 2) {
            sb3.append((char) bArr[i13]);
        }
        String sb4 = sb3.toString();
        byte[] decode = Base64.decode(sb4.substring(sb4.indexOf("<KID>") + 5, sb4.indexOf("</KID>")), 0);
        byte b13 = decode[0];
        decode[0] = decode[3];
        decode[3] = b13;
        byte b14 = decode[1];
        decode[1] = decode[2];
        decode[2] = b14;
        byte b15 = decode[4];
        decode[4] = decode[5];
        decode[5] = b15;
        byte b16 = decode[6];
        decode[6] = decode[7];
        decode[7] = b16;
        qVarArr[0] = new q(true, null, 8, decode, 0, 0, null);
        return new a(uuid, q13, qVarArr);
    }

    @Override // e8.d
    public final boolean d(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // e8.d
    public final void f(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f57729e = false;
        }
    }

    @Override // e8.d
    public final void j(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f57729e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f57730f = UUID.fromString(attributeValue);
        }
    }

    @Override // e8.d
    public final void k(XmlPullParser xmlPullParser) {
        if (this.f57729e) {
            this.f57731g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
