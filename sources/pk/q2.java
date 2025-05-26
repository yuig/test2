package pk;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class q2 extends d {

    /* renamed from: f, reason: collision with root package name */
    public transient ok.g0 f100474f;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        Objects.requireNonNull(readObject);
        this.f100474f = (ok.g0) readObject;
        Object readObject2 = objectInputStream.readObject();
        Objects.requireNonNull(readObject2);
        l((Map) readObject2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f100474f);
        objectOutputStream.writeObject(this.f100375d);
    }

    @Override // pk.d
    public final Map g() {
        Map map = this.f100375d;
        return map instanceof NavigableMap ? new l(this, (NavigableMap) this.f100375d) : map instanceof SortedMap ? new o(this, (SortedMap) this.f100375d) : new i(this, this.f100375d);
    }

    @Override // pk.d
    public final Collection h() {
        return (List) this.f100474f.get();
    }

    @Override // pk.d
    public final Set i() {
        Map map = this.f100375d;
        return map instanceof NavigableMap ? new m(this, (NavigableMap) this.f100375d) : map instanceof SortedMap ? new p(this, (SortedMap) this.f100375d) : new k(this, this.f100375d);
    }
}
