package r0;

import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: a */
    public static final h f105629a;

    /* renamed from: b */
    public static final h f105630b;

    /* renamed from: c */
    public static final h f105631c;

    /* renamed from: d */
    public static final h f105632d;

    /* renamed from: e */
    public static final h f105633e;

    /* renamed from: f */
    public static final h f105634f;

    /* renamed from: g */
    public static final h f105635g;

    /* renamed from: h */
    public static final HashSet f105636h;

    /* renamed from: i */
    public static final List f105637i;

    static {
        h hVar = new h(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f105629a = hVar;
        h hVar2 = new h(5, "HD", Collections.singletonList(new Size(1280, 720)));
        f105630b = hVar2;
        h hVar3 = new h(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f105631c = hVar3;
        h hVar4 = new h(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        f105632d = hVar4;
        h hVar5 = new h(0, "LOWEST", Collections.emptyList());
        f105633e = hVar5;
        h hVar6 = new h(1, "HIGHEST", Collections.emptyList());
        f105634f = hVar6;
        f105635g = new h(-1, "NONE", Collections.emptyList());
        f105636h = new HashSet(Arrays.asList(hVar5, hVar6, hVar, hVar2, hVar3, hVar4));
        f105637i = Arrays.asList(hVar4, hVar3, hVar2, hVar);
    }
}
