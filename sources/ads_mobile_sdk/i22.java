package ads_mobile_sdk;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class i22 implements a.ea {

    /* renamed from: a */
    public final String f6184a;

    /* renamed from: b */
    public final jl f6185b;

    /* renamed from: c */
    public final il f6186c;

    /* renamed from: d */
    public final n41 f6187d;

    /* renamed from: e */
    public final ju1 f6188e;

    /* renamed from: f */
    public final Integer f6189f;

    public i22(String str, jl jlVar, il ilVar, n41 n41Var, ju1 ju1Var, Integer num) {
        this.f6184a = str;
        this.f6185b = jlVar;
        this.f6186c = ilVar;
        this.f6187d = n41Var;
        this.f6188e = ju1Var;
        this.f6189f = num;
    }

    public static i22 a(String str, il ilVar, n41 n41Var, ju1 ju1Var, Integer num) {
        if (ju1Var == ju1.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new i22(str, sx2.a(str), ilVar, n41Var, ju1Var, num);
    }
}
