package by.yanushkevich.action;

public class IDGenerator {
		private static int currentID = 0;

		public long next() {
				return currentID++;
		}
}
