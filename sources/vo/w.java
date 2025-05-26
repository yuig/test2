package vo;

import android.content.Context;
import android.content.pm.ShortcutManager;
import ao2.j0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f126384r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f126385s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, List list, bl2.c cVar) {
        super(2, cVar);
        this.f126384r = context;
        this.f126385s = list;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new w(this.f126384r, this.f126385s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ShortcutManager shortcutManager = (ShortcutManager) this.f126384r.getSystemService(ShortcutManager.class);
        if (shortcutManager != null) {
            return Boolean.valueOf(shortcutManager.setDynamicShortcuts(this.f126385s));
        }
        return null;
    }
}
