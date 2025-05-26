package td;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class q0 implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f117430b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    public final p0 f117431a;

    public q0(p0 p0Var) {
        this.f117431a = p0Var;
    }

    @Override // td.c0
    public final boolean a(Object obj) {
        return f117430b.contains(((Uri) obj).getScheme());
    }

    @Override // td.c0
    public final b0 b(Object obj, int i13, int i14, nd.l lVar) {
        com.bumptech.glide.load.data.e aVar;
        Uri uri = (Uri) obj;
        ge.d dVar = new ge.d(uri);
        o0 o0Var = (o0) this.f117431a;
        int i15 = o0Var.f117427a;
        int i16 = 1;
        ContentResolver contentResolver = o0Var.f117428b;
        switch (i15) {
            case 0:
                aVar = new com.bumptech.glide.load.data.a(0, contentResolver, uri);
                break;
            case 1:
                aVar = new com.bumptech.glide.load.data.a(i16, contentResolver, uri);
                break;
            default:
                aVar = new com.bumptech.glide.load.data.o(contentResolver, uri, 1);
                break;
        }
        return new b0(dVar, aVar);
    }
}
