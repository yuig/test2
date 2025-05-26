package oq0;

import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.f0;
import kotlin.collections.z0;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final List f97215a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f97216b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f97217c;

    static {
        a aVar = new a(yc0.b.heart, "❤️");
        a aVar2 = new a(yc0.b.joy, "😂");
        a aVar3 = new a(yc0.b.heart_eyes, "😍");
        a aVar4 = new a(yc0.b.open_mouth, "😮");
        a aVar5 = new a(yc0.b.thumbs_up, "👍");
        a aVar6 = new a(yc0.b.thumbs_down, "👎");
        f97215a = f0.j(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
        f97216b = z0.f(new Pair("❤️", aVar), new Pair("😂", aVar2), new Pair("😍", aVar3), new Pair("😮", aVar4), new Pair("👍", aVar5), new Pair("👎", aVar6));
        f97217c = z0.f(new Pair(aVar, "❤️"), new Pair(aVar2, "😂"), new Pair(aVar3, "😍"), new Pair(aVar4, "😮"), new Pair(aVar5, "👍"), new Pair(aVar6, "👎"));
    }
}
