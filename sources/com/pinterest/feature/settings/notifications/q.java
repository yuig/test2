package com.pinterest.feature.settings.notifications;

import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.settings.SettingsRoundHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f48251r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f48252s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(v vVar, bl2.c cVar) {
        super(2, cVar);
        this.f48252s = vVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        q qVar = new q(this.f48252s, cVar);
        qVar.f48251r = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((k) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        u50.i0 newTitle;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        k kVar = (k) this.f48251r;
        SettingsRoundHeaderView settingsRoundHeaderView = this.f48252s.G0;
        if (settingsRoundHeaderView != null) {
            String str = kVar.f48214a;
            if (str != null) {
                newTitle = bs1.c.h2(str);
            } else {
                newTitle = bs1.c.j2(new String[0], e52.c.notif_settings_manage_notifications);
            }
            Intrinsics.checkNotNullParameter(newTitle, "newTitle");
            GestaltText gestaltText = settingsRoundHeaderView.f51778c;
            if (gestaltText == null) {
                Intrinsics.r("title");
                throw null;
            }
            pk.a0.q(gestaltText, newTitle);
        }
        return Unit.f80348a;
    }
}
