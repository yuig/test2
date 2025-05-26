package u4;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class s extends h {

    /* renamed from: v0, reason: collision with root package name */
    public ArrayList f120284v0;

    @Override // u4.h
    public void L() {
        this.f120284v0.clear();
        super.L();
    }

    @Override // u4.h
    public final void O(com.google.firebase.messaging.q qVar) {
        super.O(qVar);
        int size = this.f120284v0.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((h) this.f120284v0.get(i13)).O(qVar);
        }
    }

    public abstract void f0();

    public final void g0(h hVar) {
        this.f120284v0.remove(hVar);
        hVar.L();
    }
}
