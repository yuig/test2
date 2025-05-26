package v72;

import ac2.o1;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f124395a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f124396b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f124397c;

    public a(o1 videoManager) {
        Intrinsics.checkNotNullParameter(videoManager, "videoManager");
        this.f124395a = videoManager;
        this.f124396b = new LinkedHashMap();
        this.f124397c = new LinkedHashMap();
    }

    public final boolean a(String sceneViewIdentityKey) {
        Set set;
        Intrinsics.checkNotNullParameter(sceneViewIdentityKey, "sceneViewIdentityKey");
        Integer num = (Integer) this.f124397c.get(sceneViewIdentityKey);
        return !(num == null || (set = (Set) this.f124396b.get(num)) == null || !set.contains(sceneViewIdentityKey)) || b(sceneViewIdentityKey);
    }

    public final boolean b(String str) {
        Integer num = (Integer) this.f124397c.get(str);
        if (num != null) {
            LinkedHashMap linkedHashMap = this.f124396b;
            Object obj = linkedHashMap.get(num);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(num, obj);
            }
            Set set = (Set) obj;
            if (set.size() < 1) {
                set.add(str);
                return true;
            }
        }
        return false;
    }
}
