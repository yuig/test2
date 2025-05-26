package com.pinterest.api.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0012¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0014R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R(\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\t8\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/pinterest/api/model/li;", "", "", "<set-?>", "a", "Z", "c", "()Z", "showIdeaPinIndicator", "Lcom/pinterest/api/model/hi;", "b", "Lcom/pinterest/api/model/hi;", "()Lcom/pinterest/api/model/hi;", "creatorDisplayOptions", "", "I", "_overflowButtonPlacement", "<init>", "()V", "overflowButtonPlacement", "(ZLcom/pinterest/api/model/hi;I)V", "com/pinterest/api/model/ki", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class li {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("show_idea_pin_indicator")
    private boolean showIdeaPinIndicator;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("creator_display_options")
    private hi creatorDisplayOptions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("overflow_button_placement")
    private int _overflowButtonPlacement;

    static {
        new ki(null);
    }

    private li() {
        this.showIdeaPinIndicator = true;
    }

    /* renamed from: a, reason: from getter */
    public final hi getCreatorDisplayOptions() {
        return this.creatorDisplayOptions;
    }

    public final z32.q1 b() {
        z32.o1 o1Var = z32.q1.Companion;
        int i13 = this._overflowButtonPlacement;
        o1Var.getClass();
        return z32.o1.a(i13);
    }

    /* renamed from: c, reason: from getter */
    public final boolean getShowIdeaPinIndicator() {
        return this.showIdeaPinIndicator;
    }

    public li(boolean z13, hi hiVar, int i13) {
        this.showIdeaPinIndicator = z13;
        this.creatorDisplayOptions = hiVar;
        this._overflowButtonPlacement = i13;
    }
}
