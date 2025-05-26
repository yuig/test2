package me2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87046i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f87047j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(0);
        this.f87046i = i13;
        this.f87047j = fVar;
    }

    public final String b() {
        switch (this.f87046i) {
            case 0:
                return "Attaching at " + this.f87047j.hashCode() + ", handle: " + this.f87047j.f87059l + ", surface: " + this.f87047j.f87050c;
            case 1:
                return "Detaching at " + this.f87047j.hashCode() + ", handle: " + this.f87047j.f87059l + ", surface: " + this.f87047j.f87050c;
            case 2:
            default:
                return "Stopped at " + this.f87047j.hashCode() + ", handle: " + this.f87047j.f87059l + ", surface: " + this.f87047j.f87050c;
            case 3:
                return "Pausing at " + this.f87047j.hashCode() + ", handle: " + this.f87047j.f87059l + ", surface: " + this.f87047j.f87050c;
            case 4:
                return "Invalid handlers at " + this.f87047j.hashCode() + ", handle: " + this.f87047j.f87059l + ", surface: " + this.f87047j.f87050c;
            case 5:
                return "Resizing at " + this.f87047j.hashCode() + ", handle: " + this.f87047j.f87059l + ", surface: " + this.f87047j.f87050c;
            case 6:
                return "Resized at " + this.f87047j.hashCode() + ", handle: " + this.f87047j.f87059l + ", surface: " + this.f87047j.f87050c;
            case 7:
                return "Resuming at " + this.f87047j.hashCode() + ", handle: " + this.f87047j.f87059l + ", surface: " + this.f87047j.f87050c;
            case 8:
                return "Start Running at " + this.f87047j.hashCode() + ", handle: " + this.f87047j.f87059l + ", surface: " + this.f87047j.f87050c;
            case 9:
                return "Ending Running at " + this.f87047j.hashCode() + ", handle: " + this.f87047j.f87059l + ", surface: " + this.f87047j.f87050c;
            case 10:
                return "End Running at " + this.f87047j.hashCode() + ", handle: " + this.f87047j.f87059l + ", surface: " + this.f87047j.f87050c;
            case 11:
                return "Starting at " + this.f87047j.hashCode() + ", handle: " + this.f87047j.f87059l + ", surface: " + this.f87047j.f87050c;
            case 12:
                return "Stopping at " + this.f87047j.hashCode() + ", handle: " + this.f87047j.f87059l + ", surface: " + this.f87047j.f87050c;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f87046i) {
            case 2:
                this.f87047j.f87056i = true;
                break;
        }
        return b();
    }
}
