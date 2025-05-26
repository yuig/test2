package el;

import il.i4;
import il.o5;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class u0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f59537a;

    /* renamed from: b, reason: collision with root package name */
    public final ml.a f59538b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.crypto.tink.shaded.protobuf.k f59539c;

    /* renamed from: d, reason: collision with root package name */
    public final i4 f59540d;

    /* renamed from: e, reason: collision with root package name */
    public final o5 f59541e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f59542f;

    public u0(String str, ml.a aVar, com.google.crypto.tink.shaded.protobuf.k kVar, i4 i4Var, o5 o5Var, Integer num) {
        this.f59537a = str;
        this.f59538b = aVar;
        this.f59539c = kVar;
        this.f59540d = i4Var;
        this.f59541e = o5Var;
        this.f59542f = num;
    }

    public static u0 a(String str, com.google.crypto.tink.shaded.protobuf.k kVar, i4 i4Var, o5 o5Var, Integer num) {
        if (o5Var == o5.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new u0(str, c1.a(str), kVar, i4Var, o5Var, num);
    }
}
