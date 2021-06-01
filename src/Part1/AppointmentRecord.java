package Part1;

import java.time.LocalDate;
import java.util.Objects;

public class AppointmentRecord {

    private LocalDate appointmentsDate;
    private String topic;
    private LocalDate time;

    public AppointmentRecord(LocalDate appointmentsDate, String topic, LocalDate time) {
        this.appointmentsDate = appointmentsDate;
        this.topic = topic;
        this.time = time;
    }

    public LocalDate getAppointmentsDate() {
        return appointmentsDate;
    }

    public void setAppointmentsDate(LocalDate appointmentsDate) {
        this.appointmentsDate = appointmentsDate;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "AppointmentRecord{" +
                "appointmentsDate=" + appointmentsDate +
                ", topic='" + topic + '\'' +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppointmentRecord that = (AppointmentRecord) o;
        return Objects.equals(appointmentsDate, that.appointmentsDate) && Objects.equals(topic, that.topic) && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appointmentsDate, topic, time);
    }
}