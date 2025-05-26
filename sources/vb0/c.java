package vb0;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.UUID;
import lb0.o;
import pk.a0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final o f125449a;

    /* renamed from: b, reason: collision with root package name */
    public final ob0.a f125450b;

    /* renamed from: c, reason: collision with root package name */
    public String f125451c;

    public c(o oVar, ob0.a aVar) {
        this.f125450b = aVar;
        this.f125449a = oVar;
    }

    public final String a() {
        boolean s03 = a0.s0(this.f125451c);
        o oVar = this.f125449a;
        if (s03) {
            this.f125451c = ((lb0.b) oVar).j("PREF_INSTALL_ID", "");
        }
        if (a0.s0(this.f125451c)) {
            try {
                String substring = UUID.randomUUID().toString().toLowerCase().replaceAll("-", "").substring(0, 26);
                String str = substring + new String(zo2.a.a(MessageDigest.getInstance("MD5").digest((substring + "user").getBytes(StandardCharsets.UTF_8)))).substring(27);
                this.f125451c = str;
                ((lb0.b) oVar).n("PREF_INSTALL_ID", str);
            } catch (Exception e13) {
                ((tb0.h) this.f125450b).o("ApplicationUtils:GetInstallId", e13);
            }
        }
        String str2 = this.f125451c;
        return str2 != null ? str2 : "";
    }
}
