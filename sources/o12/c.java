package o12;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.deserializer.BoardDeserializer;
import com.pinterest.api.model.deserializer.DynamicStoryDeserializer;
import com.pinterest.api.model.deserializer.PinDeserializer;
import com.pinterest.api.model.eq;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.ow;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zs;
import d12.i;
import dl1.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import nm.u;
import rz.d;

/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final Set f92785e = h1.f(f30.class, v7.class, vh.class);

    /* renamed from: a, reason: collision with root package name */
    public final i f92786a;

    /* renamed from: b, reason: collision with root package name */
    public final PinDeserializer f92787b;

    /* renamed from: c, reason: collision with root package name */
    public final BoardDeserializer f92788c;

    /* renamed from: d, reason: collision with root package name */
    public final DynamicStoryDeserializer f92789d;

    public c(i repoBatcher, PinDeserializer pinDeserializer, BoardDeserializer boardDeserializer, DynamicStoryDeserializer storyDeserializer) {
        Intrinsics.checkNotNullParameter(repoBatcher, "repoBatcher");
        Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
        Intrinsics.checkNotNullParameter(boardDeserializer, "boardDeserializer");
        Intrinsics.checkNotNullParameter(storyDeserializer, "storyDeserializer");
        this.f92786a = repoBatcher;
        this.f92787b = pinDeserializer;
        this.f92788c = boardDeserializer;
        this.f92789d = storyDeserializer;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        String str;
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        String o13 = pinterestJsonObject.o("bookmark", "");
        Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
        vd0.a k13 = pinterestJsonObject.k("data");
        Intrinsics.checkNotNullExpressionValue(k13, "optJsonArray(...)");
        ArrayList arrayList = new ArrayList();
        int d2 = k13.d();
        for (int i13 = 0; i13 < d2; i13++) {
            vd0.c json = k13.j(i13);
            String d13 = json.d("type");
            if (d13 != null) {
                str = d13.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (str != null) {
                int hashCode = str.hashCode();
                u uVar = json.f125623a;
                switch (hashCode) {
                    case -1002058100:
                        if (str.equals("board_section")) {
                            Object e13 = vd0.c.f125622b.e(uVar, ba.class);
                            Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.BoardSection");
                            arrayList.add((ba) e13);
                            break;
                        } else {
                            break;
                        }
                    case 110997:
                        if (str.equals("pin")) {
                            PinDeserializer pinDeserializer = this.f92787b;
                            pinDeserializer.getClass();
                            Intrinsics.checkNotNullParameter(json, "json");
                            arrayList.add(pinDeserializer.e(json, false, false));
                            break;
                        } else {
                            break;
                        }
                    case 3599307:
                        if (str.equals("user")) {
                            Object e14 = vd0.c.f125622b.e(uVar, wy0.class);
                            Intrinsics.g(e14, "null cannot be cast to non-null type com.pinterest.api.model.User");
                            arrayList.add((wy0) e14);
                            break;
                        } else {
                            break;
                        }
                    case 93166550:
                        if (str.equals("audio")) {
                            Object e15 = vd0.c.f125622b.e(uVar, eq.class);
                            Intrinsics.g(e15, "null cannot be cast to non-null type com.pinterest.api.model.IdeaPinMusicMetadata");
                            arrayList.add((eq) e15);
                            break;
                        } else {
                            break;
                        }
                    case 93908710:
                        if (str.equals("board")) {
                            BoardDeserializer boardDeserializer = this.f92788c;
                            boardDeserializer.getClass();
                            Intrinsics.checkNotNullParameter(json, "json");
                            arrayList.add(boardDeserializer.e(json, false, false));
                            break;
                        } else {
                            break;
                        }
                    case 109770997:
                        if (str.equals("story")) {
                            DynamicStoryDeserializer dynamicStoryDeserializer = this.f92789d;
                            dynamicStoryDeserializer.getClass();
                            Intrinsics.checkNotNullParameter(json, "json");
                            arrayList.add(dynamicStoryDeserializer.e(json, false, false));
                            break;
                        } else {
                            break;
                        }
                    case 570402602:
                        if (str.equals("interest")) {
                            Object e16 = vd0.c.f125622b.e(uVar, zs.class);
                            Intrinsics.g(e16, "null cannot be cast to non-null type com.pinterest.api.model.Interest");
                            arrayList.add((zs) e16);
                            break;
                        } else {
                            break;
                        }
                    case 2072332025:
                        if (str.equals("shuffle")) {
                            Object e17 = vd0.c.f125622b.e(uVar, fi0.class);
                            Intrinsics.g(e17, "null cannot be cast to non-null type com.pinterest.api.model.Shuffle");
                            arrayList.add((fi0) e17);
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        ow owVar = new ow();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (f92785e.contains(((s) next).getClass())) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            owVar.a((s) it2.next());
        }
        i.a(this.f92786a, owVar);
        return new b(arrayList, o13);
    }
}
