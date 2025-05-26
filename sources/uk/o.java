package uk;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f122375a = new CopyOnWriteArrayList();

    public static void a(String str) {
        Iterator it = f122375a.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException(a.a.j("No KMS client does support: ", str));
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
        throw null;
    }
}
