package jubair.Dip;

import java.util.List;

public class DIP {
        private List<Developer> developers;

    public DIP(List < Developer > developers) {

            this.developers = developers;
        }

        public void implement () {

            developers.forEach(d -> d.develop());
        }
    }
