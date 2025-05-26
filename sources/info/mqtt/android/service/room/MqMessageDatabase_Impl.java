package info.mqtt.android.service.room;

import android.content.Context;
import ja.e0;
import ja.g;
import ja.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf2.c;
import kotlin.jvm.internal.Intrinsics;
import oa.d;
import oa.f;
import u71.b;

/* loaded from: classes4.dex */
public final class MqMessageDatabase_Impl extends MqMessageDatabase {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f72904p = 0;

    /* renamed from: o, reason: collision with root package name */
    public volatile c f72905o;

    @Override // ja.d0
    public final s d() {
        return new s(this, new HashMap(0), new HashMap(0), "MqMessageEntity");
    }

    @Override // ja.d0
    public final f e(g gVar) {
        e0 callback = new e0(gVar, new b(this, 1, 1), "1569b25bb8b179d5ea5abec331608dd1", "9ccd73a516869ab5a16d53d895bdefd1");
        Context context = gVar.f75216a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return gVar.f75218c.q(new d(context, gVar.f75217b, callback, false, false));
    }

    @Override // ja.d0
    public final List f(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // ja.d0
    public final Set i() {
        return new HashSet();
    }

    @Override // ja.d0
    public final Map j() {
        HashMap hashMap = new HashMap();
        hashMap.put(c.class, Collections.emptyList());
        return hashMap;
    }

    @Override // info.mqtt.android.service.room.MqMessageDatabase
    public final c t() {
        c cVar;
        if (this.f72905o != null) {
            return this.f72905o;
        }
        synchronized (this) {
            try {
                if (this.f72905o == null) {
                    this.f72905o = new c(this);
                }
                cVar = this.f72905o;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return cVar;
    }
}
